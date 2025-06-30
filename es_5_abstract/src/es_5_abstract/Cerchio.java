package es_5_abstract;

public class Cerchio extends Forma {
	double raggio;

	
	public Cerchio(double raggio) {
		super();
		this.raggio = raggio;
	}
	
	@Override
	public double calcolaArea() {
		return  Math.PI * raggio * raggio;
	}
	@Override
	public double calcolaPerim() {
		return 2 * Math.PI * raggio;
	}
}
