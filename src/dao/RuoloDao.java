package dao;

import java.util.ArrayList;
import java.util.List;

import model.Ruolo;

public class RuoloDao {
	private List<Ruolo> listaRuoli = new ArrayList<Ruolo>();
	
	public Ruolo ricercaRuolo(int idRuolo) {
		for(Ruolo r : listaRuoli) {
			if(r.getIdRuolo() == idRuolo) {
				return r;
			}
		}
		
		return null;
	}
	
	public void addRuolo(Ruolo ruolo) {
		listaRuoli.add(ruolo);
	}
	
	public boolean aggiorna(Ruolo ruolo) {
		for(Ruolo r : listaRuoli) {
			if(r.getIdRuolo() == ruolo.getIdRuolo()) {
				r.setDescrizione(ruolo.getDescrizione());
				return true;
			}
		}
		return false;
	}
	
	public boolean elimina(Ruolo ruolo) {
		for(Ruolo r: listaRuoli) {
			if(r.getIdRuolo() == ruolo.getIdRuolo()) {
				listaRuoli.remove(ruolo);
				return true;
			}
		}
		return false;
	}
}
