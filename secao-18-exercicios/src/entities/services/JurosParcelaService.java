package entities.services;

public class JurosParcelaService implements JurosService{

	@Override
	public Double juros(Double valor, int parcela) {
		return ( valor + (valor * 0.01 * parcela) ) * 1.02;
	}	
}
