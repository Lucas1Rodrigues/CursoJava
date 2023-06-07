package heranca;

public class BussinesAccount extends Account {
	private Double limit;

	public BussinesAccount(Double balance, String holder, Integer number, Double limit) {
		super(balance, holder, number);
		this.limit = limit;
	}

	public BussinesAccount() {
		super();
	}

	public Double getLimit() {
		return limit;
	}

	public void setLimit(Double limit) {
		this.limit = limit;
	}
	
	public void loan(Double loan) {
		if(this.limit <= loan) {
			this.balance += loan - 10;
		}
	}
	
	@Override
	public void withdraw(Double amount) {
		super.withdraw(amount);
		this.balance -= 15;
		
	}
	
	
	
	
	
}
