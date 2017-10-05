public class Series extends Circuit {
	Circuit r1;
	Circuit r2;
	public Series(Circuit r1, Circuit r2) {
		this.r1=r1;
		this.r2=r2;
		this.R=this.r1.R+this.r2.R;
		V=r1.getPotentialDiff()+r2.getPotentialDiff();
	}
	public double getResistance() {
		return R;
	}
	public double getPotentialDiff() {
		return r1.getPotentialDiff()+r2.getPotentialDiff();				
	}

	public void applyPotentialDiff(double V) {
		double I = V/getResistance();
		r1.applyPotentialDiff(I*r1.getResistance());
		r2.applyPotentialDiff(I*r1.getResistance());
		
	}

}
