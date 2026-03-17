package dao;

import java.util.ArrayList;
import java.util.List;

import model.Impiegato;

public class ImpiegatoDao {
	private List<Impiegato> listaImpiegati = new ArrayList<Impiegato>();
	
	public Impiegato ricercaPerCodiceFicale(String codiceFiscale) {
		for(Impiegato i : listaImpiegati) {
			if(i.getCodiceFiscale().equals(codiceFiscale)) {
				return i;
			}
		}
		
		return null;
	}
	
	public void inserisci(Impiegato impiegato) {
		listaImpiegati.add(impiegato);
	}
	
	public boolean aggiorna(Impiegato impiegato) {
		for(Impiegato i : listaImpiegati) {
			if(i.getCodiceFiscale().equalsIgnoreCase(impiegato.getCodiceFiscale())) {
				i.setNome(impiegato.getNome());
				i.setCognome(impiegato.getCognome());
				return true;
			}
		}
		
		return false;
	}
	
	public boolean elimina(Impiegato impiegato) {
		for(Impiegato i : listaImpiegati) {
			if(i.getCodiceFiscale().equalsIgnoreCase(impiegato.getCodiceFiscale())) {
				listaImpiegati.remove(impiegato);
				return true;
			}
		}
		
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String stringaImpiegati = "";
		
		for(Impiegato i : listaImpiegati) {
			stringaImpiegati += "Nome: "+i.getNome()+", cognome: "+i.getCognome()+", codice fiscale: "+i.getCodiceFiscale()+", matricola: "+i.getMatricola()+"\n";
		}
		return stringaImpiegati;
	}
	
	
}
