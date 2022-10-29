package entities;

public class Product {
	
	String name;
	Double price;
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	// M�todo de refer�ncia est�tico
	public static String staticUpperCaseName(Product p) {
		return p.getName().toUpperCase();
		
	}
	
}
