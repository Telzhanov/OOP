class StarTriangle{
	int width;
	public StarTriangle(int width) {
		this.width=width;
	}
	public String toString() {
		String s = "";
		for (int i=0; i<width; i++) {
			
				for (int j=0; j<=i; j++) {
				s=s+"[*]";
			}
			s=s+"\n";
		}
		return s;
	}
	
}
public class Ex2 {
	public static void main(String[] args) {
		StarTriangle small = new StarTriangle(3);
		System.out.println(small.toString());
		StarTriangle big = new StarTriangle(5);
		System.out.println(big);
	}

}
