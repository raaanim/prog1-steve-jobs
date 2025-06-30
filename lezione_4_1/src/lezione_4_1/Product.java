package lezione_4_1;

import java.time.LocalDate;

public class Product {
	private String nome;
	private String marca;
	private double prezzo;
	private LocalDate scadenza;
	
	public Product (String nome, String marca, double prezzo, LocalDate scadenza) {
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.scadenza = scadenza;
		
}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	public LocalDate getScadenza() {
		return scadenza;
	}

	public void setScadenza(LocalDate scadenza) {
		this.scadenza = scadenza;
	}

	
	 public boolean isExpired(LocalDate scadenza) {
		 LocalDate oggi = LocalDate.now();
	 	 if(scadenza.isBefore(oggi)) {
	 		 return true;
	 	 }
	 	 return false;
	}
	
	
	@Override
	public String toString() {
		return "Product [nome=" + nome + ", marca=" + marca + ", prezzo=" + prezzo + ", scadenza=" + scadenza + "]";
	}

	
	

	
	
	
}


