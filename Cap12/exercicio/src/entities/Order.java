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
		this.moment = moment;
		this.status = status;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date l) {
		this.moment = l;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public void addOrderItem(OrderItem oI) {
		orderItem.add(oI);
	}
	
	public void removeOrderItem(OrderItem order) {
		orderItem.remove(order);
	}

	
	public String toString() {
		Date date = new Date();
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY: \n");
		sb.append("Order moment: " + date.getTime()); 
		sb.append("Order status: " + status.PROCESSING + "\n");
		sb.append("Client: " + client.toString());
		sb.append("Order items:\n");
		for (OrderItem o : orderItem) {
			sb.append(o.getProduct());
		}
		return sb.toString();
	}
	
}

