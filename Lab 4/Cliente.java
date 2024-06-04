public class Cliente {
    private String nome;
    private String cognome;
    private String email;
    private String password;
    private String dataDiNascita;

    // Costruttore
    public Cliente(String nome, String cognome, String email, String password, String dataDiNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.password = password;
        this.dataDiNascita = dataDiNascita;
    }

    // Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(String dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    // Metodo create
    public static Cliente create() {
        return new Cliente();
    }

    // Metodo setAttributi
    public void setAttributi(String nome, String cognome, String email, String password, String dataDiNascita) {
        setNome(nome);
        setCognome(cognome);
        setEmail(email);
        setPassword(password);
        setDataDiNascita(dataDiNascita);
    }
}