class Student extends Person{
	public Student(String name) {
		super(name);
	}
	public String getName() {
		 System.out.println("Student name " + this.name);
		 return this.name;
	 }
	
}
public class ex4{
	static void getInformation(Person p) {
		p.getName();
	}
	public static void main(String[] args) {
		Student studentObject = new Student("Askhat");
		Person p=new Student("Askhat");
		p.getName();
		Employee employeeObject = new Employee("Askhat");
		Person ref=studentObject;
		ref.getName();
		getInformation(employeeObject);
		
	}
}