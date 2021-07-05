package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Program_function {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		//List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		//List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());

		/*Function<Product, String> func = p -> p.getName().toUpperCase();
		List<String> names = list.stream().map(func).collect(Collectors.toList());*/
		
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
	}

}
