package exercicio2;

public class Empregados {

	private int id;
	private String nome;
	private double salario;
	
	public Empregados(int id, String nome, double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentaSalario( double porcentagem) {
		this.salario = this.salario + (this.salario*(porcentagem/100));
	}
	
}
