package _02_esercizio_pianta;

public class Cactus extends Pianta {
	int id;
	String acqua_immagazzinata;
	
	public Cactus (String acqua_immagazzinata, int id, String nome, String tipologia, String sole) {
		super(nome, tipologia, sole);
		this.id = id;
		this.acqua_immagazzinata = acqua_immagazzinata;
	}	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTipologia() {
		return tipologia;
	}
	
	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}
	
	public String getSole() {
		return sole;
	}
	
	public void setSole(String sole) {
		this.sole = sole;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId( int id) {
		this.id = id;
	}
	
	public String getAcqua_immagazzinata() {
		return acqua_immagazzinata;
	}
	
	public void setAcqua_immagazzinata(String acqua_immagazzinata) {
		this.acqua_immagazzinata = acqua_immagazzinata;
	}
	
}
