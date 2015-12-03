package ufpb.aps.observer.listeners;

import ufpb.aps.observer.central.CentralListener;
import ufpb.aps.observer.central.Chamada;
import ufpb.aps.observer.central.TipoChamada;

public class Modem implements CentralListener {

	@Override
	public void novoEvento(Chamada c) {
		// TODO Auto-generated method stub
		if(c.getTipo() == TipoChamada.Dados){
			System.out.println("Modem - Chamada de Dados de id - "+c.getId() +" recebida");
		}
	}

}
