package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		String nameClient;
		String emailClient;
		Date birthDateClient;
		String statusOrder;
		Integer totalOrders;
		String productName;
		Double productPrice;
		Integer orderQuantity;
		
		System.out.println("Enter client data:");
		System.out.print("Name:");
		nameClient = sc.nextLine();
		System.out.print("Email:");
		emailClient = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY):");
		birthDateClient = sdf.parse(sc.next());
				
		Client client = new Client(nameClient, emailClient, birthDateClient);

		System.out.println("Enter order data:");
		System.out.print("Status:");
		statusOrder = sc.next();

		System.out.print("How many items to this order?");
		totalOrders = sc.nextInt();
		
		Order order = new Order();
		
		order.setClient(client);
		order.setStatus(OrderStatus.valueOf(statusOrder));
		order.setMoment(new Date(System.currentTimeMillis()));
		
		for (int i=1;i<=totalOrders;i++) {
			System.out.println("Enter #" + i + " item data:");
			sc.nextLine();
			System.out.print("Product name: ");
			productName = sc.nextLine();
			System.out.print("Product price: ");
			productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			orderQuantity = sc.nextInt();
			
			Product product = new Product(productName, productPrice);
			OrderItem orderItem = new OrderItem(product, orderQuantity, productPrice);
			order.addItem(orderItem);
		}
		
		System.out.println(order.toString());
		
		sc.close();
	}

}
