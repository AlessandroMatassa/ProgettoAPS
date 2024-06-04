public class PacchettoVacanza {
private String alloggio;
private String periodoSoggiorno;
private Double costo;

public PacchettoVacanza(String alloggio, String periodoSoggiorno, Double costo){
    this.alloggio = alloggio;
    this.periodoSoggiorno = periodoSoggiorno;
    this.costo = costo;
}

//getter e setter
public String getAlloggio(){
    return alloggio;
}

public String getPeriodoSoggiorno(){
    return periodoSoggiorno
}

public Double getCosto(){
    return costo;
}


public String setAlloggio(String alloggio){
    this.alloggio = alloggio;
}

public String setPeriodoSoggiorno(String periodoSoggiorno){
    this.periodoSoggiorno = periodoSoggiorno; 
}

public Double setCosto(Double costo){
    this.costo = costo;
}

public PacchettoVacanza create(){
    return new Cliente();
}

public PacchettoVacanza inserisciPacchetto(Double costo, String periodoSoggiorno, String alloggio){
    //inserisce un pacchetto vacanza nel catalogo
}

public PacchettoVacanza rimuoviPacchetto(PacchettoVacanza pacchetto){
    //rimuove un pacchetto vacanza dal catalogo
}

public Viaggio associaViaggio(Viaggio viaggio){
    //associa un viaggio ad un pacchetto vacanza
}

public Catalogo associaCatalogo(Catalogo catalogo){
    //associa un pacchetto vacanza ad un catalogo
}


}