package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import entities.Candidato;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Map<Candidato, Integer> candidatoMap = new LinkedHashMap<>();
		
		System.out.print("Enter file full path: ");
		String path = sc.next();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			while (line != null) {
				String fields[] = line.split(",");
				int votos = Integer.parseInt(fields[1]);
				
				Candidato c = new Candidato(fields[0]);
				
				if (candidatoMap.containsKey(c)) {
					candidatoMap.put(c, candidatoMap.get(c) + votos);
				}else {
					candidatoMap.put(c, votos);
				}
			
				line = br.readLine();
			}
			
			for(Candidato candidado : candidatoMap.keySet()) {
				System.out.println(candidado + ": " + candidatoMap.get(candidado));
			}
			
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}

}
