package _02_esercizio_pianta;

public class Pino extends Pianta{
	int id;
	int altezza;

	public Pino (int id,int altezza, String tipologia, String nome, String sole) {
		super(nome, tipologia, sole);
		this.id = id;
		this.altezza = altezza;
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAltezza() {
		return altezza;
	}

	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}
}
