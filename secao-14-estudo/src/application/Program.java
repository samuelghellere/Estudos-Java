package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Accont;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * Estudo herança e polimorfismo*/
		
		/*Accont acc = new Accont(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		Accont acc1 = bacc;
		Accont acc2 = new BusinessAccount(1003, "Bob", 0.0,200.0);
		Accont acc3 = new SavingAccount(1004, "Anna", 0.0, 0.01);
		
		//DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.load(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount) acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.load(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingAccount) {
			SavingAccount acc5 = (SavingAccount) acc3;
			acc5.updataBalance();
			System.out.println("Update!");
		}
		
		Accont acc6 = new Accont(1001, "Alex", 1000.0);
		acc6.withdraw(200.0);
		System.out.println(acc6.getBalance());
		
		Accont acc7 = new SavingAccount(1002, "Maria", 1000.0, 0.01);
		acc7.withdraw(200.0);
		System.out.println(acc7.getBalance());
		
		Accont acc8 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc8.withdraw(200.0);
		System.out.println(acc8.getBalance());*/
		
		/*
		 * Estudo abstrata*/
		
		Locale.setDefault(Locale.US);
		
		List<Accont> list = new ArrayList<>();
		list.add(new SavingAccount(1001, "Alex",500.00,0.01));
		list.add(new BusinessAccount(1002, "Maria",1000.00,400.00));
		list.add(new SavingAccount(1003, "Bob",300.00,0.01));
		list.add(new BusinessAccount(1005, "Ana",500.00,500.00));
		
		double sum = 0.0;
		
		for(Accont acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n", sum);
		
		for(Accont acc : list) {
			acc.deposit(10.00);;
		}
		
		for(Accont acc : list) {
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
		
	}

}
