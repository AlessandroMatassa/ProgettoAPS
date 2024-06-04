public class Prenotazione {
	
	//attributi
	private String codicePrenotazione;
	private double importoTotale;
	private String status;
	private Viaggiatore[] viaggiatori;
	private PacchettoVacanza pacchettoVacanza;
	private Pagamento[2] pagamenti;
	
	
	//metodi
	public void create() {
		//crea un istanza Prenotazione
	};
	
	public void cancellaPrenotazione(String codicePrenotazione) {
		//cancella una prenotazione da una richiesta di cancellazione
	}
	
	public void aggiornaStatus(String status) {
		//modifica status
	}
	
	public void modificaPrenotazione(String codicePrenotazione, Viaggiatore viaggiatore) {
		//modifica di una prenotazione
	}
	
	public void aggiungiViaggiatore(Viaggiatore viaggiatore) {
		//aggiunta di un Viaggiatore nella Prenotazione
	}
	
	public void aggiornaCosto(double importo) {
		//modifica dell'importoTotale
	}
	
	public void associaCliente(Cliente cliente) {
		//associa la prenotazione con cliente
	}
	
	public void associaPacchettoVacanza(PacchettoVacanza pacchettoVacanza) {
		//associa la prenotazione con pacchettoVacanza
	}
	
	public void rimuoviViaggiatore(Viaggiatore viaggiatore) {
		//rimuove un Viaggiatore dalla Prenotazione
	}
	
	public void eliminaPrenotazione(Prenotazione prenotazione)
		//elimina una prenotazione dal sistema
}