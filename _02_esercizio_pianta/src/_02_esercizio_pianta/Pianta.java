package _02_esercizio_pianta;

public class Pianta {
	String nome;
	String tipologia;
	String sole;
	
	public Pianta (String nome, String tipologia, String sole) {
		this.nome = nome;
		this.tipologia = tipologia;
		this.sole = sole;
		
		
		
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

}
