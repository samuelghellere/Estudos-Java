package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	SimpleDateFormat sdf_moment = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	private List<OrderItem> listOrderItem = new ArrayList<>();
	
	public Order() {
		
	}
	
	public Order(Client client, Date moment, OrderStatus status) {
		this.client = client;
		this.moment = moment;
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
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
	
	public void addItem(OrderItem orderItem) {
		listOrderItem.add(orderItem);	
	}
	
	public void removeItem(OrderItem orderItem) {
		listOrderItem.remove(orderItem);	
	}
	
	public Double total() {
		Double total;

		total = 0.00;

		for(OrderItem o : listOrderItem) {
			total += o.subTotal();
		}
		
		return total; 
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("ORDER SUMMARY: \n");
		sb.append("Order moment: "+ sdf_moment.format(getMoment()) + "\n");
		sb.append("Order status: " + getStatus() + "\n");
		sb.append("Client: " + getClient().getName() + " - " + getClient().getEmail() +"\n");
		sb.append("\nOrder items: \n");
		for (OrderItem o : listOrderItem) {
			sb.append(o.getProduct().getName() +", $"+ String.format("%.2f", o.getPrice()) + ", Quantity: " + o.getQuantity() + ", SubTotal: $" + String.format("%.2f", o.subTotal()) + "\n");
		}
		sb.append("Total price: $" + String.format("%.2f", this.total()));
		
		return sb.toString(); 
	}
}
