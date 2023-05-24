package bankAccount;
import java.util.Scanner;
import java.util.*;

public class Account {
	private String numConta;
	private String nomeTitular;
	private char yesOrNo;
	private boolean hasInitialDeposit;
	private float balance;
	
	public Account(String numConta, String nomeTitular, boolean hasInitialDeposit,float balance){
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		this.hasInitialDeposit = true;
		this.balance = balance;
	}


	public Account(String numConta, String nomeTitular) {
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		this.hasInitialDeposit = false;
	}
	
	
	public void deposit(int value) {
			this.balance += value;
			this.hasInitialDeposit = true;
	}
	
	public void withdraw(int value) {
		if (hasInitialDeposit) {
			this.balance -= value+5;
		}
	}
	
	//getters and setters
	public String getNomeTitular() {
		return nomeTitular;
	}


	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}


	public String getNumConta() {
		return numConta;
	}


	public boolean isHasInitialDeposit() {
		return hasInitialDeposit;
	}


	public float getBalance() {
		return balance;
	}


	@Override
	public String toString() {
		return "Account [numConta=" + numConta + ", nomeTitular=" + nomeTitular + ", balance=" + balance + "]";
	}
	
	
	
}
