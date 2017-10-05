
public class Tester {

	public static void main(String[] args) {
		Circuit a = new Resistor(3);
		Circuit b = new Resistor(3);
		Circuit c = new Resistor(6);
		Circuit d = new Resistor(3);
		Circuit e = new Resistor(2);
		Circuit f = new Series(a, b);
		System.out.println(f.getResistance());
		Circuit g = new Parallel(c, d);
		System.out.println(g.getResistance());
		Circuit h = new Series(g, e);
		System.out.println(h.getResistance());
		Circuit circuit = new Parallel(h,f);
		double R=circuit.getResistance();
		System.out.println(R);
		
	}

}
