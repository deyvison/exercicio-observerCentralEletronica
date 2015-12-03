package ufpb.aps.observer.listeners;
import ufpb.aps.observer.central.CentralListener;
import ufpb.aps.observer.central.Chamada;
import ufpb.aps.observer.central.TipoChamada;

public class Telefone implements CentralListener {

	@Override
	public void novoEvento(Chamada c) {
		// TODO Auto-generated method stub
	
		if(c.getTipo() == TipoChamada.Voz){
			System.out.println("Telefone - Chamada de voz de id - "+c.getId() +" recebida");
		}
	}
	

}
