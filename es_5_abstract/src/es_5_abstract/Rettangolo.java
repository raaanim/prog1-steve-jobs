package es_5_abstract;

public class Rettangolo extends Forma{
	double altezza;
	double base;
	
	
	
	public Rettangolo(double altezza, double base) {
		super();
		this.altezza = altezza;
		this.base = base;
		
	}
	
	
	@Override
	public double calcolaArea() {
		return base * altezza ;
	}
	
	@Override
	public double calcolaPerim() {
		return (altezza + base) * 2;
	}

}
