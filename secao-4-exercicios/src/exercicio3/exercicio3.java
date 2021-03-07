package exercicio3;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        int diferenca;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        diferenca = (a * b - c * d);

        System.out.println("DIFERENCA = " + diferenca);

        sc.close();

    }

}
