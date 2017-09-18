import java.util.Scanner;
public class Ex5 {
	public static void main(String[] args) {
		double a;
		Scanner scan = new Scanner(System.in);
		a=scan.nextDouble();
		System.out.println("Perimeter: "+a*4);
		System.out.println("Area: "+a*a);
		System.out.println("Length of diameter: "+Math.sqrt((a*a)+(a*a)));
	}
}
