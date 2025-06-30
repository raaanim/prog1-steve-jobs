package es_5_abstract;

    public class Triangolo extends Forma {
	private double base;
	private double altezza;
	private double latoA;
	private double latoB;
	private double latoC;
	
	

	public Triangolo(double base, double altezza, double latoA, double latoB, double latoC) {
		super();
		this.base = base;
		this.altezza = altezza;
		this.latoA = latoA;
		this.latoB = latoB;
		this.latoC = latoC;
	}



	@Override
	public double calcolaArea() {
		return base * altezza / 2;
	}



	@Override
	public double calcolaPerim() {
		return latoA + latoB + latoC;
	}
	
	
}
