package dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Storico;
import model.Storico;

public class StoricoDao {
	private List<Storico> listaStorici = new ArrayList<Storico>();
	
	public Storico ricercaStorico(int idStorico) {
		for(Storico s : listaStorici) {
			if(s.getIdStorico() == idStorico) {
				return s;
			}
		}
		
		return null;
	}
	
	public void addStorico(Storico storico) {
		listaStorici.add(storico);
	}
	
	public boolean aggiorna(Storico storico) {
		for(Storico s : listaStorici) {
			if(s.getIdStorico() == storico.getIdStorico()) {
				s.setDataInizio(storico.getDataInizio());
				s.setDataFine(storico.getDataFine());
				return true;
			}
		}
		return false;
	}
	
	public boolean elimina(Storico storico) {
		for(Storico s: listaStorici) {
			if(s.getIdStorico() == storico.getIdStorico()) {
				listaStorici.remove(storico);
				return true;
			}
		}
		return false;
	}
}
