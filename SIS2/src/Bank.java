import java.util.Vector;

public class Bank {
	Vector<Account> users = new Vector<Account>();
	void openingAccount(Account user) {
		users.add(user);
	}
	void closingAccount(Account user) {
		for (int i=0; i<users.size(); i++) {
			if (users.get(i).equals(user)) {
				users.remove(user);
			}
		}
	}
	void uptade() {
		for (int i=0; i<users.size(); i++) {
			users.get(i).update();
		}
	}
}
	