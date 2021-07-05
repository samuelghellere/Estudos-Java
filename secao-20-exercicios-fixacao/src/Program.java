import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String path = "B:\\Pessoal\\Udemy\\Cursos\\Java\\Workspace\\secao-20-exercicios-fixacao\\in.txt";
		
		try(BufferedReader br = new BufferedReader( new FileReader(path))){
			
			List<Employee> list = new ArrayList<>();
			
			String line = br.readLine();
			while(line!=null) {		
				String fields[] = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			System.out.print("Enter salary: ");
			double salaryBase = sc.nextDouble();
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> emails = list.stream()
					.filter(e -> e.getSalary() > salaryBase)
					.map(e -> e.getEmail())
					/*.sorted(comp.reversed())*/
					.sorted(comp)
					.collect(Collectors.toList());

			System.out.print("Email of people whose salary is more than " + String.format("%.2f", salaryBase) + ": ");
			emails.forEach(System.out::println);
			
			double sum = list.stream()
					.filter(e -> e.getName().charAt(0) == 'M')
					.map(e -> e.getSalary())
					.reduce(0.0, (x, y) -> x + y);
					/*.reduce(0.0, Double::sum);*/
			
			System.out.print("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));
		}catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		sc.close();
	}

}
