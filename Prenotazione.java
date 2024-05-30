public class Prenotazione {
	
	//attributi
	protected String codicePrenotazione;
	protected double importoTotale;
	protected String status;
	protected Viaggiatore[] viaggiatori;
	
	//metodi
	create() {
		//creazione di un istanza Prenotazione
	};
	
	inserisciDatiForm(String nome, String cognome, String dataDiNascita, String codiceFiscale) {
		//creazione di un Viaggiatore e inizializzazione dei suoi attributi
	}
	
	eliminaPrenotazione(String codicePrenotazione) {
		//eliminazione di una prenotazione
	}
	
	//NOTA: non dovrebbe avere un paramentro status?
	aggiornaStatus() {
		//modifica status
	}
	
	modificaPrenotazione(String codicePrenotazione, Viaggiatore viaggiatore, double importo) {
		//modifica di una prenotazione
	}
	
	aggiungiViaggiatore(Viaggiatore viaggiatore) {
		//aggiunta di un Viaggiatore nella Prenotazione
	}
	
	aggiornaCosto(double importo) {
		//modifica dell'importoTotale
	}
}