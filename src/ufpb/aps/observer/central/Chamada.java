package ufpb.aps.observer.central;
public class Chamada {

	private TipoChamada tipo;
	private String id;
	
	public Chamada(TipoChamada tipo, String id) {
		// TODO Auto-generated constructor stub
		this.tipo = tipo;
		this.id = id;
	}
	
	
	public TipoChamada getTipo(){
		return this.tipo;
	}
	
	public String getId(){
		return this.id;
	}
	
}
