package entities;

public class ImportedProduct extends Product{
	private Double costomsFee;

	public ImportedProduct() {
		super();
	}
	
	public ImportedProduct(String name, Double price, Double costomsFee) {
		super(name, price);
		this.costomsFee = costomsFee;
	}

	public Double getCostomsFee() {
		return costomsFee;
	}

	public void setCostomsFee(Double costomsFee) {
		this.costomsFee = costomsFee;
	}
	
	public Double totalPrice() {
		return this.getPrice() + this.getCostomsFee();
	}

	@Override
	public String priceTag() {
		return this.getName() + " $ " + String.format("%.2f", this.totalPrice()) + " (Customs fee: $ " + String.format("%.2f", this.getCostomsFee()) + ")";
	}
	
}
