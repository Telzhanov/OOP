import java.util.Scanner;
class Data
{
	private double d1=0;
	private double d2=-99999;
	private int i1=0;;
	public Data(){
		
		
	}
	public void addData(double number) {
		d1=d1+number;
		i1++;
		if (number>d2) {
			d2=number;
		}
	}
	public double average() {
		return d1/i1;
	}
	public double large() {
		return d2;
	}
	
}
public class Ex4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Data d1= new Data();
		while(true)
		{
			System.out.print("Enter number(Q to quit): ");
			String s1=scan.next();
			if (s1.charAt(0)=='Q') {
				System.out.println("Average="+d1.average());
				System.out.println("Maximum="+d1.large());
				break;
				}
				else {
					double value=Double.parseDouble(s1);
					d1.addData(value);
				}
		}
	}

}
