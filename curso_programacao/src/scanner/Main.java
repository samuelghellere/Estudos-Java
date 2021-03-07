package scanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*String x;
		int y;
		double z;
		char u;
		x = sc.next();
		
		System.out.println("Você digitou: " + x);
		
		y = sc.nextInt();
		System.out.println("Você digitou: " + y);
		
		z = sc.nextDouble();
		System.out.println("Você digitou: " + z);
		
		u = sc.next().charAt(0);
		System.out.println("Você digitou: " + u);*/
		
		int x;
		String s1, s2, s3;
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();

	}

}
