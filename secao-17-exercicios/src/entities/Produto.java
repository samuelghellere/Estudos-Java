package entities;

public class Produto {

	private String nome;
	private double precoUnitario;
	private int quantidade;
	
	public Produto() {
		
	}
	
	public Produto(String nome, double precoUnitario, int quantidade) {
		this.nome = nome;
		this.precoUnitario = precoUnitario;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	private double total() {
		return this.quantidade * this.precoUnitario; 
	}
	
	public String precoTotal() {
		return String.format("%.2f", total());
	}
	
}
