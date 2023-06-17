package model.entities;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;
	
	//constructors
	public Account () {
		
	}

	public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}//Getters and Setters

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
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
	
	//especial methods
	public void withdraw(Double amount) {
		this.balance -= amount;
	
		
	}
	public void deposit(Double amount) {
		
	}

}
