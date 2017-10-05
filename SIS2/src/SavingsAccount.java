
public class SavingsAccount extends Account {
	double interestRate;
	public SavingsAccount(int a, double interesRate) {
		super(a);
		this.interestRate=interesRate;
	}
	public void addInteresRate() {
		this.deposit(this.getBalance()*this.interestRate);
	}
	public void update() {
		addInteresRate();
	}
}
