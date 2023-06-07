package heranca;

public class Application {

	public static void main(String[] args) {
		Account acc1 = new SavingsAccount(1000.0, "Lucas", 1211, 0.01);
		acc1.withdraw(500.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new Account(1000.0,"Pedro",1232);
		acc2.withdraw(500.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BussinesAccount(1000.0, "Luxx", 1222, 100.0);
		acc3.withdraw(500.0);
		System.out.println(acc3.getBalance());
		
		
		
		
		
	}

}
