class Student{
	String name;
	int id;
	int course;
	public Student(String name, int id, int course) {
		this.name=name;
		this.id=id;
		this.course=course;
	}
	public void Info() {
		System.out.println("Student name: "+name );
		System.out.println("Student ID: " + id);
		System.out.println("Student course: " +course);
	}
	public void Increment() {
		course++;
		System.out.println("Course: " + course);
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
}
public class Ex1 {
	public static void main(String[] args) {
		Student first = new Student("Askhat", 1,1);
		first.Info();
		first.Increment();
	}
}
