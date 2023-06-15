package entities;

import java.util.Date;

public class UsedProduct extends Product {

	private Date manufacture;
	
	public UsedProduct() {
		
	}

	public UsedProduct(String name, Double price, Date manufacture) {
		super(name, price);
		this.manufacture = manufacture;
	}

	public Date getManufacture() {
		return manufacture;
	}

	public void setManufacture(Date manufacture) {
		this.manufacture = manufacture;
	}
	
	//especial methods
	@Override
	
	public String priceTag() {
		return "Date: " + this.manufacture + "\n Name: " + this.name + "\n Price $" + this.price;
	}
}
