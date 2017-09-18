import java.util.Scanner;
public class Ex4 {
	public static void main(String[] args) {
		double a,b,c,d;
		double x1,x2;
		Scanner scan = new Scanner( System.in );
		a=scan.nextDouble();
		b=scan.nextDouble();
		c=scan.nextDouble();
		d=(b*b)-4*a*c;
		if (d>0) {
			x1=((-1*b)+Math.sqrt(d))/(2*a);
			x2=((-1*b)-Math.sqrt(d))/(2*a);
			System.out.println(x1+" " +x2);
		}
		if (d==0) {
			x1=((-1*b)+Math.sqrt(d))/(2*a);
			System.out.println(x1);
		}
		if (d<0)
		{
			System.out.println("There are no x1 and x2");
		}
;	}
}
