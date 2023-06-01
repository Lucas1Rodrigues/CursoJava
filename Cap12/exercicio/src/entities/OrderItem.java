package entities;

public class OrderItem {
	private int quantity;
	private Double price;
	private String name;
	
	public OrderItem(int quantity, Double price, String name) {
		this.quantity = quantity;
		this.price = price;
		this.name = name;
	}


	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	
	
}
