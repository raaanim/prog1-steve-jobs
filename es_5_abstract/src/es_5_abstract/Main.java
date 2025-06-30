package es_5_abstract;

public class Main {
	
public static void main (String[]args) {
	Cerchio c = new Cerchio(5);
	double areaCerchio = c.calcolaArea();
	System.out.println("L'area del cerchio è: "+areaCerchio);
	
	Rettangolo rect = new Rettangolo(5, 10);
	double perimetroRettangolo = rect.calcolaPerim();
	System.out.println("Il perimetro del rettangolo è: "+perimetroRettangolo);
}
}
