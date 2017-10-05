public class Resistor extends Circuit{
	private double pottentialDifference;
	public Resistor(int R) {
		this.R=R;
	}
	public double getResistance() {
			return this.R;
	}

	public double getPotentialDiff() {
		return pottentialDifference;
	}

	public void applyPotentialDiff(double V) {
		pottentialDifference=V;
	}
	public double getCurrent() {
		return pottentialDifference/R;
	}
}
