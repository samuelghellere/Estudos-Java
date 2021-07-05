package entities;

public class Product {
	private String name;
	private Double price;
	
	public Product(String name, Double price) {
		super();
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

	public static boolean staticPredicate(Product p) {
		return p.getPrice() >= 100.00;
	}

	public boolean nonStaticPredicate() {
		return this.getPrice() >= 100.00;
	}
	
	public static void staticPriceUpdate(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}
	
	public void nonStaticPriceUpdate() {
		this.setPrice(this.getPrice() * 1.1);
	}
	
	public static String staticUpperCaseName(Product p) {
		return p.getName().toUpperCase();
	}
	
	public String nonStaticUpperCaseName() {
		return this.getName().toUpperCase();
	}
	
	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}

/*	@Override
	public int compareTo(Product other) {
		return this.name.toUpperCase().compareTo(other.name.toUpperCase());
	}*/
	
	
}
