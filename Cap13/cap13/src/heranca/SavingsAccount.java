package heranca;

public class SavingsAccount extends Account {
	private Double interestRate;

	public SavingsAccount(Double balance, String holder, Integer number, Double interestRate) {
		super(balance, holder, number);
		this.interestRate = interestRate;
	}

	public SavingsAccount() {
		super();
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		this.balance += this.balance * interestRate;
	}
	
}
