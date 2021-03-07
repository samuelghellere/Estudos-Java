package copia_pbd;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		File pastaExecutavel = new File("Base executavel");
		File pastaPBD = new File("PBD");
		File[] arquivos = pastaExecutavel.listFiles();

		int totalPBDcopiar;
		boolean sucesso = true;
		boolean temPBDcopiar;
		
		totalPBDcopiar = pastaPBD.listFiles().length;
		totalPBDcopiar -= 1;
		temPBDcopiar = totalPBDcopiar > 0;
		
		if (!temPBDcopiar) {
			System.out.println("A pasta PBD está vazia!" );
		}else {
			System.out.println("Total de PBDs para copiar: " + totalPBDcopiar );
		
			for(File arquivo : arquivos) {
			    if(arquivo.getName().endsWith("pbd") || arquivo.getName().equals("folha.exe")) {
			    	System.out.println("Deletando arquivo " + arquivo.getName() );
			    	sucesso = arquivo.delete();
			    	if (!sucesso) break;
			    }
			}
			
			if (!sucesso){
				System.out.println("Falha ao tentar deletar as PBDs!");
			}else {
				System.out.println("PBDs deletadas com sucesso!");
	
				arquivos = pastaPBD.listFiles(); 
				for(File arquivo : arquivos) {
				    if(arquivo.getName().endsWith("pbd") || arquivo.getName().equals("folha.exe")) {
				    	System.out.println("Copiando arquivo " + arquivo.getName() );
				    	sucesso = arquivo. renameTo(new File(pastaExecutavel, arquivo.getName()));
				    	if (!sucesso) break;
				    }
				}
				if (!sucesso){
					System.out.println("Falha ao tentar copiar as PBDs!");
				}else {
					System.out.println("PBDs copiadas com sucesso!");
				}
			}
		}
	}

}
