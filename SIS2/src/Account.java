
public abstract class Account {
	private double balance;
	private int accNumber;
	public Account(int a) {
		balance=0;
		accNumber=a;
	}
	public void deposit(double sum) {
		balance=balance+sum;
		
	}
	public void withdraw(double sum) {
		balance=balance-sum;
	}
	public double getBalance() {
		return balance;
	}
	public int getAccountNumber() {
		return accNumber;
	}
	public void transfer(double amount, Account other) {
		other.balance=other.balance+amount;
		this.balance=balance-balance;
	}
	public String toString() {
		return "accNumber: "+this.getAccountNumber() +" balance " +balance;
		
	}
	public final void print() {
		System.out.println(toString());
	}
	public abstract void update();
}
