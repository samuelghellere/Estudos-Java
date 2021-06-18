import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program_Filewriter_BufferedWriter {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		String path = "B:\\\\Pessoal\\\\Udemy\\\\Cursos\\\\Java\\\\Workspace\\\\secao-17-estudo\\\\temp\\\\out.txt";
		
		try(BufferedWriter  bw = new BufferedWriter(new FileWriter(path, true))){//true para não recriar o arquivo
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	
	}

}
