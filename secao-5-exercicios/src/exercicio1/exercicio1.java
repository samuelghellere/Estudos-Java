package exercicio1;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		String menssagem;
		
		numero = sc.nextInt();
		
		menssagem = (numero < 0) ? "NEGATIVO" : "NAO NEGATIVO"; 
				
		System.out.println(menssagem); 
				
		sc.close();

	}

}
