package exercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int[][] matriz = new int[x][y];
		
		for (int i=0; i<x;i++) {
			for (int j = 0;j<y; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		int numeroProcurar = sc.nextInt();
				
		for (int i=0; i<x;i++) {
			for (int j = 0;j<y; j++) {
				if (matriz[i][j] == numeroProcurar) {
					System.out.println("Position " + i + "," + j + ":");
											
					if (j > 0) {
						System.out.println("Left: " + matriz[i][j-1]);
					}
					
					if (i > 0) {
						System.out.println("Up: " + matriz[i-1][j]);
					}
					
					if (j < (y-1)) {
						System.out.println("Right: " + matriz[i][j+1]);
					}

					if (i < (x-1)) {
						System.out.println("Down: " + matriz[i+1][j]);
					}
					
				}
			}
		}
		
		sc.close();
	}

}
