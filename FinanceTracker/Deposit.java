package FinanceTracker;

public class Deposit extends Transaction {
	
	private String info;
	
	public Deposit(String type, double amount, String info) {
		super(type, amount);
		this.info = info;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	

}
