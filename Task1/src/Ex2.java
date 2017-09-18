import java.util.Scanner; 

public class Ex2 {

	public static void main(String[] args) {
		int x;
		Scanner scan = new Scanner(System.in);
		x=Integer.parseInt(scan.nextLine());
		if (x>=95) {
			System.out.println("A");
		} else if (x<95 && x>=90) {
			System.out.println("A-");			
		} else if (x<90 && x>=85) {
			System.out.println("B+");
		} else if (x<85 && x>=80) {
			System.out.println("B");
		} else if (x<80 && x>=75) {
			System.out.println("B-");
		} else if (x<75 && x>=70) {
			System.out.println("C+");
		} else if (x<70 && x>=65) {
			System.out.println("C");
		} else if (x<65 && x>=60) {
			System.out.println("C-");
		} else if (x<60 && x>=55) {
			System.out.println("D+");
		} else if (x<55 && x>=50) {
			System.out.println("D");
		} else if (x<50)  {
			System.out.println("F");
		}
		

	}

}
