package entities;

public class PessoaJuridica extends Pessoa{

	public Integer numeroFuncionario;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionario) {
		super(nome, rendaAnual);
		this.numeroFuncionario = numeroFuncionario;
	}

	public Integer getNumeroFuncionario() {
		return numeroFuncionario;
	}

	public void setNumeroFuncionario(Integer numeroFuncionario) {
		this.numeroFuncionario = numeroFuncionario;
	}

	@Override
	public double totalImposto() {
		double valorImposto;
		if (this.getNumeroFuncionario() > 10) {
			valorImposto = this.getRendaAnual()*0.14;
		}else {
			valorImposto = this.getRendaAnual()*0.16;
		}
		return valorImposto;
	}

}
