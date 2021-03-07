package exercicio2;

public class Funcionario {

	String nome;
	double salario;
	double imposto;
	
	public double NetSalary() {
		return salario - imposto;
	}
	
	public void IncreaseSalary(double percentual) {
		salario += (salario * (percentual/100.00));  
	}
	
	public String toString() {
		return nome + ", " + " $ " + String.format("%.2f", NetSalary());
	}
}
