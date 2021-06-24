package modal.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

	private Integer number;
	private Date data;
	Double totalValue;
	
	List<Installment> instalments = new ArrayList<>();
		
	public Contract() {
		
	}
	
	public Contract(Integer number, Date data, Double totalValue) {
		this.number = number;
		this.data = data;
		this.totalValue = totalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public Date getData() {
		return data;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public List<Installment> getInstallmets(){
		return instalments;
	}
	public void addInstallment(Installment installment) {
		this.instalments.add(installment);
	}
	
}
