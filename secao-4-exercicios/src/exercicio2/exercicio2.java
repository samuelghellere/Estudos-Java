package exercicio2;

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {

        double raio;
        double tt = 3.14159;
        double area;

        Scanner sc = new Scanner(System.in);

        raio = sc.nextDouble();

        area = tt * (Math.pow(raio, 2));

        System.out.printf("A= %.4f", area);

        sc.close();

    }

}
