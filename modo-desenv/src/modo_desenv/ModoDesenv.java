package modo_desenv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ModoDesenv {

	String usuario;
	String path = "";
	String pathBackup = "";
	boolean pronto = false;
	
	public ModoDesenv(String usuario) throws IOException{
		String path = "";
		boolean encontroArquivo = true;

		if (usuario != null) {
			path = "C:\\Users\\" +  usuario + "\\AppData\\Roaming\\Domsis\\";
			if (!existeDir(path)){
				path = "C:\\Users\\u" +  usuario + "\\AppData\\Roaming\\Domsis\\";
				if (!existeDir(path)){
					encontroArquivo = false;
				}
			}

			if (!encontroArquivo) {
				System.out.println("O caminho " + path + " não está acessivel ou o arquivo contabil.ini não existe!");
			}else{
				setPath(path + "contabil.ini");
				setPathBackup(path + "contabilbkp.ini");
				setPronto(true);
			}
		}else {
			System.out.println("Não foi possivel identificar o usuario da maquina!");
		}
	}
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getPathBackup() {
		return pathBackup;
	}

	public void setPathBackup(String pathBackup) {
		this.pathBackup = pathBackup;
	}
	
	public boolean isPronto() {
		return pronto;
	}

	public void setPronto(boolean pronto) {
		this.pronto = pronto;
	}
	
	public static boolean verifica_modo_desenv(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		boolean modo_desenv;

		modo_desenv = false;
		
		while (true) {
			if (linha != null) {
				
				if (!linha.equals("")) {
					linha = linha.replace(" ", "");
					linha = linha.toLowerCase(); 
					if (linha.contains("modo_desenv=sim")) {
						modo_desenv = true;
					}
				}
			} else
				break;
			linha = buffRead.readLine();
		}
		buffRead.close();
		
		return modo_desenv;
	}
		
	public static void leitor(String path, String pathteste, boolean ativarmododesenv) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(pathteste));
		String linha = "";
		
		if (ativarmododesenv){
			linha = "[desenvolvimento]\nmodo_desenv=sim";
		}
		
		while (true) {
			if (linha != null) {
				
				if (!linha.equals("")) {
					linha = linha.replace(" ", "");
					linha = linha.toLowerCase(); 
					if ((!ativarmododesenv && !(linha.contains("modo_desenv")|| linha.toLowerCase().equals("[desenvolvimento]"))) || (ativarmododesenv)) {
						buffWrite.append(linha + "\n");
					}
				}
			} else
				break;
			linha = buffRead.readLine();
		}
		buffRead.close();
		buffWrite.close();
	}
	
	public static boolean existeDir(String caminho){
		File diretorio;
		
	    diretorio = new File(caminho);
	    if (diretorio.exists()){
	        return true;
	    }else{
	        return false;
	    }
	}
	
}
