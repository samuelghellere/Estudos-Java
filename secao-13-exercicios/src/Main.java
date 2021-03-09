import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVELERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVELERED");

		System.out.println(os1);
		System.out.println(os2);
		
	}

}
