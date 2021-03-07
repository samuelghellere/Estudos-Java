package exercicio3;

public class Aluno {

	String nome;
	double nota1, nota2, nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public boolean verificarAprovado() {
		if (notaFinal() < 60.00) {
			return false;
		}else {
			return true;
		}
	}
	
	public String toString() {
		
		String retorno;
		
		retorno = "FINAL GRADE = " + String.format("%.2f", notaFinal()) + "\n";
		if (verificarAprovado()) {
			retorno += "PASS";
		}else {
			retorno += "FAILED\n" + 
					   "MISSING " + String.format("%.2f", 60.00 - notaFinal())  + " POINTS"; 
		}
		
		return retorno;
	}
}