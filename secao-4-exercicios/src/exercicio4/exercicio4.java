package exercicio4;

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {

        int numeroFuncionario;
        int horasTrabalhadas;
        double salarioHora;
        double salario;

        Scanner sc = new Scanner(System.in);

        numeroFuncionario = sc.nextInt();
        horasTrabalhadas = sc.nextInt();
        salarioHora = sc.nextDouble();

        salario = horasTrabalhadas * salarioHora;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f", salario);

        sc.close();

    }

}
