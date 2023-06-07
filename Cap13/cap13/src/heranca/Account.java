package heranca;

public class Account {
	protected Double balance;
	protected String holder;
	protected Integer number;
	
	public Account(Double balance, String holder, Integer number) {
		super();
		this.balance = balance;
		this.holder = holder;
		this.number = number;
	}

	public Account() {
		super();
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
	
	//especial methods
	public void withdraw(Double amount) {
			this.balance -= amount + 10;
	}
	public void deposit(Double amount) {
		this.balance += amount;
	}
	

}
