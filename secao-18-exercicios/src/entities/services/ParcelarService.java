package entities.services;

import java.util.Calendar;
import java.util.Date;

import modal.entities.Contract;
import modal.entities.Installment;

public class ParcelarService {

	private Integer numeroParcela;

	private JurosService jurosService;
	
	public ParcelarService() {
	}
	
	public ParcelarService(Integer numeroParcela, JurosService jurosService) {
		this.numeroParcela = numeroParcela;
		this.jurosService = jurosService;
	}

	public void processaParcelas(Contract contractor) {
		double valorParcelado = contractor.getTotalValue() / this.numeroParcela;

		for(int i=1; i<=this.numeroParcela;i++) {
			Installment installment = new Installment(dataPagamento(contractor.getData(), i),this.jurosService.juros(valorParcelado, i));
			contractor.addInstallment(installment);
		}
	}
	
	public Date dataPagamento(Date dataContrato, int parcela) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(dataContrato);
		cal.add(Calendar.MONTH, parcela);

		return cal.getTime();
	}

	
}
