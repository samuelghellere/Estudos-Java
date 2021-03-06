package exercicio1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int quantidadeQuartos = sc.nextInt();
		
		Reserva[] r = new Reserva[9];
		
		for (int i=0; i < quantidadeQuartos; i++) {
			System.out.println("\nRent #" + (i + 1) + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int quarto = sc.nextInt();
			
			r[quarto] = new Reserva(nome, email, quarto);
			
		}
		
		System.out.println("\nBusy rooms:");
		/*for (int i=0; i < r.length; i++) {
			if (r[i] != null) {
				System.out.println(r[i].getQuarto() + ": " + r[i].getNome() + ", " + r[i].getEmail());
			}
		}*/
		
		for(Reserva res : r ) {
			if (res != null) {
				System.out.println(res.getQuarto() + ": " + res.getNome() + ", " + res.getEmail());
			}
		}
		
		
		sc.close();
	}

}
