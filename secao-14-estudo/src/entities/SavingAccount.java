package entities;

public final class SavingAccount extends Accont{

	private Double interestRate;
	
	public SavingAccount() {
		super();
	}

	public SavingAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updataBalance() {
		this.balance += this.balance * this.interestRate;
	}
	
	@Override
	public void withdraw(Double amount) {
		this.balance -= amount;
	}
}
