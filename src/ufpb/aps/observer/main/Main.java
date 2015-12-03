package ufpb.aps.observer.main;

import ufpb.aps.observer.central.CentralTelefonica;
import ufpb.aps.observer.central.Chamada;
import ufpb.aps.observer.central.TipoChamada;
import ufpb.aps.observer.listeners.Bina;
import ufpb.aps.observer.listeners.Fax;
import ufpb.aps.observer.listeners.Modem;
import ufpb.aps.observer.listeners.Telefone;

public class Main {
	
	
	public static void main(String[] args) {
		
		CentralTelefonica ct = new CentralTelefonica();
		
		ct.addListener(new Telefone());
		ct.addListener(new Bina());
		ct.addListener(new Fax());
		ct.addListener(new Modem());
		
		Chamada c = new Chamada(TipoChamada.Voz,"1");
		ct.novaLigacao(c);
		
		System.out.println("------------------------------");
		
		Chamada c1 = new Chamada(TipoChamada.Fax,"2");
		ct.novaLigacao(c1);
		
		System.out.println("------------------------------");
		
		Chamada c2 = new Chamada(TipoChamada.Dados,"3");
		ct.novaLigacao(c2);
		
	}
	
}
