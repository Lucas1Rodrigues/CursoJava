package heranca;

public class Application {

	public static void main(String[] args) {
		Account acc = new Account(0.0,"Alex",1001);
		BussinesAccount bacc = new BussinesAccount(0.0, "Maria", 1002, 500.0);
		
		// UPCASTING
		Account acc1 = bacc;
		Account acc2 = new BussinesAccount(0.0,"Bob",1003,1000.0);
		//BussinesAccount acc3 = new Account(0.0, "Fulano",1004, 200.0);
		acc2.setNumber(1010);
		
		//DOWNCASTING
		System.out.println(acc1.getHolder());
	
	}

}
