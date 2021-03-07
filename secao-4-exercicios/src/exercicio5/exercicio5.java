package exercicio5;

import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {
        int codigoPeca1;
        int numeroPeca1;
        int codigoPeca2;
        int numeroPeca2;
        double valorUnitario1;
        double valorUnitario2;
        double total;

        Scanner sc = new Scanner(System.in);

        codigoPeca1 = sc.nextInt();
        numeroPeca1 = sc.nextInt();
        valorUnitario1 = sc.nextDouble();
        codigoPeca2 = sc.nextInt();
        numeroPeca2 = sc.nextInt();
        valorUnitario2 = sc.nextDouble();

        total = (numeroPeca1 * valorUnitario1) + (numeroPeca2 * valorUnitario2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", total);


        sc.close();

    }

}
