import java.util.List;

public class RichiestaDiModifica {
    private double nuovoImporto;
    private List<Viaggiatore> viaggiatori;
    private int numeroDiPartecipanti;
    private boolean statoApprovazione = false;

    // Getters and Setters
    public double getNuovoImporto() {
        return nuovoImporto;
    }

    public void setNuovoImporto(double nuovoImporto) {
        this.nuovoImporto = nuovoImporto;
    }

    public List<Viaggiatore> getViaggiatori() {
        return viaggiatori;
    }

    public void setViaggiatori(List<Viaggiatore> viaggiatori) {
        this.viaggiatori = viaggiatori;
    }

    public int getNumeroDiPartecipanti() {
        return numeroDiPartecipanti;
    }

    public void setNumeroDiPartecipanti(int numeroDiPartecipanti) {
        this.numeroDiPartecipanti = numeroDiPartecipanti;
    }

    public boolean isStatoApprovazione() {
        return statoApprovazione;
    }

    public void setStatoApprovazione(boolean statoApprovazione) {
        this.statoApprovazione = statoApprovazione;
    }

    // Methods
    public void aggiornaStatus() {
        // Implement method logic here
    }

    public void aggiornaPrezzo() {
        // Implement method logic here
    }

    public void aggiungiViaggiatore(Viaggiatore viaggiatore, int i) {
        // Implement method logic here
    }

    public void rimuoviViaggiatore(Viaggiatore viaggiatore, int i) {
        // Implement method logic here
    }

    public void aggiornaNumeroPartecipanti(int n) {
        // Implement method logic here
    }

    public void valutazioneRichiesta() {
        // Implement method logic here
    }
}