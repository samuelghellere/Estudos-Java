package exercicio4;

public class CurrencyConverter {

	public static double converterDolarReais(double precoDolar, double quantidadeDolar) {
		double retorno;
		
		retorno = precoDolar * quantidadeDolar;
		retorno += retorno * 0.06;
		
		return retorno;
	}
}
