import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program_File_Scanner {

	public static void main(String[] args) {
		
		File file = new File("B:\\Pessoal\\Udemy\\Cursos\\Java\\Workspace\\secao-17-estudo\\temp\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

}
