package heranca;

public class BussinesAccount extends Account {
	private Double limit;

	public BussinesAccount(Double balance, String holder, Integer number, Double limit) {
		super(balance, holder, number);
		this.limit = limit;
	}
	
	
	
	
	
}
