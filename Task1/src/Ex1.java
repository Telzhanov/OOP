import java.util.Scanner;
public class Ex1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String Name = scan.nextLine();
		int l=Name.length();
		System.out.print("+");
		for(int i=0; i<l; i++) {
			System.out.print("-");
		}
		System.out.println("+");
		System.out.println("|"+Name+"|");
		System.out.print("+");
		for(int i=0; i<l; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}

}
