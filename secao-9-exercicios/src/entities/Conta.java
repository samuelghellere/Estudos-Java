package entities;

public class Conta {

	private int numero;
	private String nome;
	private double saldo;
	private double taxaSaque;
	
	public Conta(int numero, String nome, double saldo) {
		this.numero = numero;
		this.nome = nome;
		this.taxaSaque = 5.00;
		deposito(saldo);
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double valor) {
		this.saldo += valor;
	}
	
	public void saque(double valor) {
		this.saldo -= valor;
		this.saldo -= this.taxaSaque;
	}
	
	public String toString() {
		return "Account " + this.numero + ", Holder: " + this.nome + ", Balance: $ " + String.format("%.2f", this.saldo); 
	}
}
