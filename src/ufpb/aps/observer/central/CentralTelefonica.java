package ufpb.aps.observer.central;
import java.util.ArrayList;
import java.util.List;

public class CentralTelefonica {
	
	private List<CentralListener> listeners;
	
	public CentralTelefonica(){
		this.listeners = new ArrayList<CentralListener>();
	}
	
	public void novaLigacao(Chamada c){
		this.notificar(c);
	} 
	
	private void notificar(Chamada c){
		for(CentralListener listner : this.listeners){
			listner.novoEvento(c);
		}
	}
	
	
	public void addListener(CentralListener l){
		this.listeners.add(l);
	}
}
