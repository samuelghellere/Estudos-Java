package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program_finally {

	public static void main(String[] args) {
		File file = new File("B:\\Pessoal\\Udemy\\Cursos\\Java\\Workspace\\secao-15-estudo-try-catch\\in.txt");
		Scanner sc = new Scanner(System.in);
		
		try {
			sc = new Scanner (file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(FileNotFoundException e){
			System.out.println("Error opening file: " + e.getMessage());
		}
		finally {
			if (sc != null) {
				System.out.println("Close Scanner");
				sc.close();
			}
		}
	}

}
