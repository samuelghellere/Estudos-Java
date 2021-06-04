package model.entities;

import model.exception.DomainException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance = 0.00;
	private Double withDrawLimit;
	
	public Account() {
	}
	
	public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithDrawLimit() {
		return withDrawLimit;
	}

	public void setWithDrawLimit(Double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
	}

	public void deposit(Double amount) {
		balance = balance + amount;
	}
	
	public void withDraw(Double amount) throws DomainException {
		if(this.getBalance() <= 0.00 || (this.getBalance() - amount) < 0.00) {
			throw new DomainException("Not enough balance");
		}
		if(this.getWithDrawLimit() < amount) {
			throw new DomainException("The amount exceeds withdraw limit");
		}
		balance -= amount;
	}
	
	@Override
	public String toString() {
		return "New Balance: " + String.format("%.2f", this.getBalance());
	}
}
