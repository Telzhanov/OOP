class Temperature{
	private double temp;
	private char c='C';
	public Temperature(char c) {
		this.temp=0;
		this.c=c;
	}
	public Temperature(double temp) {
		this.temp=temp;
	}
	public Temperature(double temp, char c) {
		this.temp=temp;
		this.c=c;
	}
	public Temperature() {
		this.temp=0;
	}
	public double getTemp()
	{
		return this.temp;
	}
	public char getC()
	{
		return this.c;
	}
	public String toCelci() {
		return this.temp+" C";
	}
	public String toFaren() {
		return 9*(this.temp/5)+32 +" F";
	}
	public void setTemp(int temp) {
		this.temp=temp;
	}
	public void setC(char c) {
		this.c=c;
	}
	public void setAll(int temp,char c) {
		this.temp=temp;
		this.c=c;
	}
	public String show() {
		return getTemp()+" "+getC();
	}
}
public class Ex1 {
	public static void main(String[] args) {
		Temperature t1= new Temperature();
		t1.setTemp(32);
		System.out.println(t1.show());
		System.out.println(t1.toFaren());
	}
}
