package projectWork;

import model.Impiegato;
import dao.ImpiegatoDao;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creazione lista impiegati
		
		ImpiegatoDao listaImpiegati = new ImpiegatoDao();
		
		for(int i=1; i<=10; i++) {
			Impiegato impiegato = new Impiegato("Nome "+i, "Cognome "+i, "CodiceFiscale"+i, i*111111);
			listaImpiegati.inserisci(impiegato);
		}

		
		System.out.println(listaImpiegati.toString());
	}

}
