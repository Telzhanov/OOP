import java.util.Scanner;
public class Ex6 {
static String[] first = new String[] {"zero", "one","two","three","four","five","six","seven","eight","nine",
			"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen",
			"seventeen","eighteen","nineteen"};
static String[] second = new String[] {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
static String[] third = new String[] {"","","hundread","thousands"};
	public static String twoDigits(int number) {
		if (number<=19) {
			return first[number];
		}
		else {
			if(number%10==0) {
				return second[number/10];
			}
			else {
				return second[number/10]+" "+first[number%10];
			}
		}
	}
	public static String threeDigits(int number) {
		if (number-((number/100)*100)==0 && number>0)
		{
			return first[number/100]+" "+third[2];
		}
		else if(number>99 && number<1000 && number>0){
			return first[number/100]+" "+third[2]+" " + twoDigits(number-((number/100)*100));
			}
		else if(number<100 && number>0){
			return twoDigits(number-((number/100)*100));
		}
		else {
			return "";
		}
		}
	public static String fourDigits(int number) {
		return first[number/1000]+" "+"thousand"+" "+threeDigits(number-((number/1000)*1000));
	}
	public static String fiveDigits(int number) {
		return twoDigits(((number/10000)*10)+((number-(number/10000)*10000)/1000))+" "+"thousand"+" "+threeDigits(number-((number/1000)*1000));
	}
	public static String inWords(int number) {
		String str=Integer.toString(number);
		String answer="";
		int n=str.length();
		if (n==5) {
		return fiveDigits(number);
		}
		if (n==4) {
			return fourDigits(number);
		}
		if (n==3) {
			return threeDigits(number);
		}
		else {
			return twoDigits(number);
		}
	}
		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int n=scan.nextInt();
			System.out.println(inWords(n));
		}

}
