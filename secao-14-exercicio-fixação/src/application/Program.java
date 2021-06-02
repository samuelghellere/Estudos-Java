package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i=1; i<= n; i++) {
			System.out.println("Product #" + i +" data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			switch (type) {
			case 'i':
				System.out.print("Customs fee: ");
				double costomsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, costomsFee));
				break;
			
			case 'u':
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				sc.nextLine();
				Date manufactureDate = sdf.parse(sc.nextLine());
				list.add(new UsedProduct(name, price, manufactureDate));
				break;

			default:
				list.add(new Product(name, price));
				break;
			}
			
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for(Product p : list) {
			System.out.println(p.priceTag());
		}
		
		sc.close();

	}

}
