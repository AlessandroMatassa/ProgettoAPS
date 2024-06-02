#!/bin/bash

# Nome del file di output
output_file="commits.txt"
# Nome del file di log per le righe saltate
skipped_log="skipped_commits.log"

# Variabile per il filtro utente
user=$1

# Cancella il contenuto del file di output e del file di log se esistono
> "$output_file"
> "$skipped_log"

# Costruisci il comando git log con il filtro utente
git_command="git log --pretty=format:'%H|%an|%s|%ad|%b' --date=iso"

if [ -n "$user" ]; then
  git_command+=" --author='$user'"
fi

# Estrarre le commit e formattarle
eval $git_command > temp_commits.txt

# Utilizzare Python per formattare le date e gestire le descrizioni
python3 - <<END
import datetime
from dateutil import parser

def process_commit(commit):
    parts = commit[0].split('|', 4)
    if len(parts) != 5:
        return f"Skipping line due to unexpected format: {commit[0]}\n", None
    hash, author, subject, date, body = parts
    if not hash or not author or not subject or not date:
        return f"Skipping line due to missing field: {commit[0]}\n", None
    try:
        date_obj = parser.parse(date)
        formatted_date = date_obj.strftime('%Y.%m.%d alle %H:%M:%S')
        body_lines = [body] + commit[1:]
        full_body = '\n'.join(line for line in body_lines).strip()
        if not full_body:
            full_body = "N/A"
        formatted_commit = f"({hash[:7]}) - {author}\n{formatted_date}\nTitolo: {subject}\nDescrizione:\n{full_body}\n\n\n"
        return None, formatted_commit
    except Exception as e:
        return f"Error parsing date for line: {commit[0]}, error: {e}\n", None

with open("temp_commits.txt") as infile, open("$output_file", "w") as outfile, open("$skipped_log", "w") as skipfile:
    current_commit = []
    for line in infile:
        if '|' in line and current_commit:
            skip_message, formatted_commit = process_commit(current_commit)
            if skip_message:
                skipfile.write(skip_message)
            if formatted_commit:
                outfile.write(formatted_commit)
            current_commit = []
        current_commit.append(line.rstrip('\n'))
    if current_commit:
        skip_message, formatted_commit = process_commit(current_commit)
        if skip_message:
            skipfile.write(skip_message)
        if formatted_commit:
            outfile.write(formatted_commit)

print("Le commit sono state estratte e salvate in $output_file")
END

# Rimuovere il file temporaneo
rm temp_commits.txt
