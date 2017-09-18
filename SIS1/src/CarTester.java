class Car {
	double fueleff;
	double fuel=0;
	public Car(double fueleff) {
		this.fueleff=fueleff;
	}
	public void drive(double distance) {
		if (fuel-(distance/fueleff)<=0) {
			System.out.println("There is not enough fuel");
		}
		else {
			fuel=fuel-(distance/fueleff);
		}
		
		}
	public void getGasinTank() {
		System.out.println(this.fuel);
	}
	public void addGas(double fuel) {
		this.fuel=this.fuel+fuel;
	}
}
public class CarTester {
	public static void main(String[] args) {
		Car c1= new Car(20);
		c1.drive(20);
		c1.addGas(100);
		c1.drive(200);
		c1.getGasinTank();
	}
}