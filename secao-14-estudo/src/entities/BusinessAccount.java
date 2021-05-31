package entities;

public class BusinessAccount extends Accont{
	
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
		
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void load(double amount) {
		if (amount <= this.loanLimit) {
			deposit(amount);
		}
	}
	
	@Override
	public void withdraw(Double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
	
}
