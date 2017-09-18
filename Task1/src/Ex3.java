class Account{
	double money;
	double interest;
	double result; 
	public Account(double money, double interest) {
		this.money=money;
		this.interest=interest;
	}
	public void Counting() {
		result=(money*interest)+money;
		System.out.println(result);
	}
}
public class Ex3 {

	public static void main(String[] args) {
	Account first = new Account(100,0.2);
	first.Counting();
	Account second= new Account(10000,0.3);
	second.Counting();
	}

}
