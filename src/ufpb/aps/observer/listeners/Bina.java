package ufpb.aps.observer.listeners;

import ufpb.aps.observer.central.CentralListener;
import ufpb.aps.observer.central.Chamada;
import ufpb.aps.observer.central.TipoChamada;

public class Bina implements CentralListener {

	@Override
	public void novoEvento(Chamada c) {
		
		if(c.getTipo() ==  TipoChamada.Voz){
			System.out.println("Bina - Chamada de voz de id - "+c.getId() +" recebida");
		}

	}

}
