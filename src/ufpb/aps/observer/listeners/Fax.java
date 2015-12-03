package ufpb.aps.observer.listeners;

import ufpb.aps.observer.central.CentralListener;
import ufpb.aps.observer.central.Chamada;
import ufpb.aps.observer.central.TipoChamada;

public class Fax implements CentralListener {

	@Override
	public void novoEvento(Chamada c) {
		// TODO Auto-generated method stub
		
		if(c.getTipo() == TipoChamada.Fax){
			System.out.println("Fax - Chamada de fax de id - "+c.getId() +" recebida");
		}
	}

}
