public abstract class Circuit {
	double R;
	double V;
	public abstract double getResistance();
	public abstract double getPotentialDiff();
	public abstract void applyPotentialDiff(double V);
	public double getPower() {
		return Math.pow(V, 2)/R;
	}
	public double getCurrent() {
		return V/R;
	}
}
