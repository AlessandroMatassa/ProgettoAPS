public class Viaggio {
private String tipologia;
private Double costo;

public Viaggio(String tipologia, Double costo){
    this.tipologia = tipologia
    this.costo = costo;
}

//getter e setter
public String getTipologia(){
    return tipologia;
}

public Double getCosto(){
    return costo;
}


public String setTipologia(String tipologia){
    this.tipologia = tipologia;
}

public Double setCosto(Double costo){
    this.costo = costo;
}

public PacchettoVacanza create(){
    return new Cliente();
}

public Viaggio inserisciViaggio(String tipologia, Double costo){
    //inserisce un viaggio in un catalogo
}


}