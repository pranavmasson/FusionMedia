package FinanceTracker;

public class Transaction {
	
	private String type;
	private double amount;
	
	public Transaction(String type, double amount) {
		this.type = type;
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String toString() {
		return "Transaction Type: " + type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
