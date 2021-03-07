package exercicio6;

import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double triangulo;
        double circulo;
        double trapezio;
        double quadrado;
        double retangulo;

        Scanner sc = new Scanner(System.in);

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        triangulo = (a * c) / 2;
        circulo = (3.14159 * Math.pow(c, 2));
        trapezio = ((a + b) / 2) * c;
        quadrado = Math.pow(b, 2);
        retangulo = a * b;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);


        sc.close();

    }

}
