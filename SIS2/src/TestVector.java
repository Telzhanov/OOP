
public class TestVector {

	public static void main(String[] args) {
		int[] a=new int[] {1,2,3,4};
		MyCollection vector = new MyVector();
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(2, 5);
		vector.removeAt(1);
		vector.reverse();
		vector.sort();
		System.out.println(vector.toString());
	}

}
