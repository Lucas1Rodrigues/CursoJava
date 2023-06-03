package entities;

import java.text.SimpleDateFormat;
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
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
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

	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(List<OrderItem> orderItem) {
		this.orderItem = orderItem;
	}

	public double total() {
		double sum = 0.0;
		for (OrderItem it : orderItem) {
			sum += it.subTotal();
		}
		return sum;
	}
	@Override
	public String toString() {
		Date date = new Date();
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY: \n");
		sb.append("Order moment: " + sdf.format(moment)); 
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client);
		sb.append("Order items:\n");
		for (OrderItem item : orderItem) {
			sb.append(item + "\n");
		}
		sb.append("Total Price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
}
