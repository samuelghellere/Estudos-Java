package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		String path = "B:\\Pessoal\\Udemy\\Cursos\\Java\\Workspace\\secao-17-exercicios\\temp";
		String folderOut = "\\out";
		String fileOut = "\\summary.csv";
		String fileSource = "\\source.csv";
		
		List<Produto> produtos = new ArrayList<>();
		
		boolean sucesso = new File(path + folderOut).mkdir();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path + fileSource)) ){
			String line = br.readLine();
			
			while(line != null) {
				String conteudo[] = line.split(",");
				Produto p = new Produto(conteudo[0], Double.parseDouble(conteudo[1]), Integer.parseInt(conteudo[2]));
				produtos.add(p);
				
				line = br.readLine();
			}
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(path + folderOut + fileOut))) {
				for(Produto p : produtos) {
					bw.write(p.getNome() + "," + p.precoTotal());
					bw.newLine();
				}
				
				System.out.println("Criado!");
				
			}catch(IOException e) {
				System.out.println("Erro escrevendo: " + e.getStackTrace());
			}
			
		}catch(IOException e) {
			System.out.println("Erro lendo: " + e.getStackTrace());
		}
	}

}
