package entities;

import java.util.Date;

public class OrderItem {
	private int quantity;
	private Double price;
	private Product product;
	
	public OrderItem(int quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	
	public Double subTotal(int quantity, Double price) {
		this.quantity = quantity;
		this.price = price;
		return quantity*price;
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

	
	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}


	
	
	
}