public class Parallel extends Circuit{
	Circuit r1;
	Circuit r2;
	public Parallel(Circuit r1, Circuit r2) {
		this.r1= r1;
		this.r2= r2;
	}
	public double getResistance() {
		return (r1.getResistance()*r2.getResistance())/(r1.getResistance()+r2.getResistance());
	}
	public double getPotentialDiff() {
		return r1.getPotentialDiff();
	}

	public void applyPotentialDiff(double V) {
		r1.applyPotentialDiff(V);
		r2.applyPotentialDiff(V);
	}

}
