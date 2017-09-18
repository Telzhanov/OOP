import java.util.Scanner;
public class Ex5 {
	static int[] doubleAr(int [] a) {}
	public static void main(String[] args) {
		int n;
		int j=0;
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		int[] a=new int[n];
		int [] b=new int[2*n];
		for (int i=0; i<n; i++)
		{
			a[i]=scan.nextInt();
		}
		for (int i =0; i<n; i++) {
			b[j]=a[i];
			j++;
			b[j]=a[i];
			j++;
		}
		for (int i =0; i<n*2; i++) {
			System.out.print(b[i]+" ");
		}
	}

}
