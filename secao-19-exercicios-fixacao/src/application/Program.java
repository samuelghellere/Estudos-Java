package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Alunos;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Alunos> a = new HashSet<>();
		Set<Alunos> b = new HashSet<>();
		Set<Alunos> c = new HashSet<>();
		
		System.out.print("How many students for course A: ");
		int numeroAlunos = sc.nextInt();
		for (int i=1; i<= numeroAlunos; i++) {
			a.add(new Alunos(sc.nextInt()));
		}
		
		System.out.print("How many students for course B: ");
		numeroAlunos = sc.nextInt();
		for (int i=1; i<= numeroAlunos; i++) {
			b.add(new Alunos(sc.nextInt()));
		}
		
		System.out.print("How many students for course C: ");
		numeroAlunos = sc.nextInt();
		for (int i=1; i<= numeroAlunos; i++) {
			c.add(new Alunos(sc.nextInt()));
		}
		
		Set<Alunos> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.print("Total Alunos: " + total.size());
		sc.close();

	}

}
