abstract class Shapes{
	float a,b,h,r;
	abstract float volume();
	abstract float surfaceArea();
}
class Cylinder extends Shapes{
	public float volume() {
		return r*h*r*(float)Math.PI;
	}
	float surfaceArea() {
		return (2*(float)Math.PI*r*r)+(2*h*r);
	}
}
class Sphere extends Shapes{
	public float volume() {
		return (float)4/3*(float)Math.PI*r*r*r;
	}
	public float surfaceArea() {
		return 4*(float)Math.PI*r*r;
	}
}
class Cube extends Shapes{
	public float volume() {
		return a*b*h;
	}
	public float surfaceArea() {
		return a*h*6;
	}
}
