package _02_esercizio_pianta;

public class Rosa extends Pianta {
	int id;
	String colore;
	
	public Rosa (int id, String colore, String nome, String tipologia, String sole) {
		super(nome, tipologia, sole);
		this.id = id;
		this.colore = colore;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}
	
}
