package modo_desenv;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		boolean ativarmododesenv = false;
		boolean modoDesenvAtivado = false;
		boolean processar = false;
		String opcao = "";

		ModoDesenv modoDesenv = new ModoDesenv(/*args[0]*/"0181315");

		if (modoDesenv.isPronto()) {
			System.out.println("\n" + modoDesenv.getPath());
			
			System.out.println("");
			if (ModoDesenv.verifica_modo_desenv(modoDesenv.getPath())) {
				System.out.println("Modo desenvolvimento ATIVADO\n");
				modoDesenvAtivado = true;
			}
			else {
				System.out.println("Modo desenvolvimento DESATIVADO\n");
				modoDesenvAtivado = false;
			}

			do {
				if (!modoDesenvAtivado) {
					System.out.println("Digite [A] para ATIVAR..");
				}else {
					System.out.println("Digite [D] para DESATIVAR..");
				}

				opcao = sc.next();
				
				if (opcao.toLowerCase().equals("a") && !modoDesenvAtivado ) {
					ativarmododesenv = true;
					processar = true;
				}
				else if (opcao.toLowerCase().equals("d") && modoDesenvAtivado){
					ativarmododesenv = false;
					processar = true;
				}

				if (processar) {
					ModoDesenv.leitor(modoDesenv.getPath(), modoDesenv.getPathBackup(), false);
					ModoDesenv.leitor(modoDesenv.getPathBackup(), modoDesenv.getPath(), ativarmododesenv);
					System.out.println("");
					if (ModoDesenv.verifica_modo_desenv(modoDesenv.getPath())) System.out.println("Modo desenvolvimento ATIVADO\n");
					else System.out.println("Modo desenvolvimento DESATIVADO\n");
				}

			}while(!processar);
			
		}

		sc.close();
	}
}