package exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employees will be registered? ");
		int quantidadeEmpregados = sc.nextInt();
		
		List<Empregados> list = new ArrayList<>();
		
		for (int i = 0; i < quantidadeEmpregados; i++) {
			System.out.println();
			System.out.println("Emplyoee #" + (i+1) + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salario = sc.nextDouble();
			
			Empregados emp = new Empregados(id, name, salario);
			list.add(emp);
		}
		
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		System.out.print("Enter the percentage: ");
		double porcentagemAumento = sc.nextDouble();
		
		Empregados consulta = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (consulta != null ) {
			consulta.aumentaSalario(porcentagemAumento);
		}else {
			System.out.println();
			System.out.println("This id does not exist!");
		}

		System.out.println();
		System.out.println("List of employees:");
		for (Empregados empList : list) {
			System.out.println(empList.getId() + ", " + empList.getNome() + ", " + String.format("%.2f", empList.getSalario()));
		}
		
		sc.close();
	}

}
