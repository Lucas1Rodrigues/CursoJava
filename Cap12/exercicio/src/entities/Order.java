package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	
	private List<OrderItem> orderItem = new ArrayList<>();
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status) {
		super();
		this.moment = moment;
		this.status = status;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	
}

