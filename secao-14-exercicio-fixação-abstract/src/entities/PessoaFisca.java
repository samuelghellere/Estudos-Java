package entities;

public class PessoaFisca extends Pessoa{

	private Double gastoSaude;
	
	public PessoaFisca() {
		super();
	}
	
	public PessoaFisca(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double totalImposto() {
		double valorImposto = 0.00;
		
		if (this.getRendaAnual() < 20000.00) {
			valorImposto = this.getRendaAnual() * 0.15;
		}else {
			valorImposto = this.getRendaAnual() * 0.25;
		}
		
		if(this.getGastoSaude() > 0.00) {
			valorImposto -= (this.getGastoSaude()*0.5);
		}
		
		return valorImposto;
	}

}
