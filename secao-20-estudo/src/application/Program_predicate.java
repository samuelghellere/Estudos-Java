package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;
import util.ProductPredicate;

public class Program_predicate {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
	
		//list.removeIf(new ProductPredicate());
		//list.removeIf(Product::staticPredicate);
		//list.removeIf(Product::nonStaticPredicate);
		
		//Predicate<Product> pred = p -> p.getPrice() >= 100.00;
		//list.removeIf(pred);
		
		list.removeIf(p -> p.getPrice() >= 100.00);
		
		for (Product p : list) {
			System.out.println(p);
		}
	}
}
