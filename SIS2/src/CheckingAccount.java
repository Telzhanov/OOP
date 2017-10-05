
public class CheckingAccount extends Account {
	int numberTransaction;
	int freeTransaction;
	double fee=0.02;
	public CheckingAccount(int a,int freeTransaction) {
		super(a);
		numberTransaction=0;
		this.freeTransaction=freeTransaction;
	}
	void deductFee() {
		if (freeTransaction-numberTransaction<0) {
			this.withdraw(fee*Math.abs(freeTransaction-numberTransaction));
		}
		else {
			numberTransaction=0;
		}
	}
	public void deposit(double sum) {
		super.deposit(sum);
		numberTransaction++;
	}
	public void withdraw(double sum) {
		super.withdraw(sum);
		numberTransaction++;
	}
	public void transfer(double amount,Account other) {
		super.transfer(amount, other);
		numberTransaction++;
	}
	public void update() {
		deductFee();
	}
}
