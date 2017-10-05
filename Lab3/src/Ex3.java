import java.util.Vector;

class Person{
	String name;
	public boolean equals(Object o) {
		if (o instanceof Person) {
			Person other= (Person)o;
			return this.name==other.name;
		}
		else return false;
		
	}
	 public String toString() {
		return name;
	}
	 public Person(String name) {
		 this.name=name;
	 }
	 public String getName() {
		 System.out.println("Person name " + this.name);
		 return this.name;
	 }
}
 class Employee extends Person{
	double salary;
	int year;
	String insuranceNumber;
	public Employee(String name) {
		super(name);
	}
	public Employee(String name,double salary, int year, String insuranceNumber) {
		super(name);
		this.insuranceNumber = insuranceNumber;
		this.salary=salary;
		this.year=year;
	}
	public boolean equals(Object o) {
		if (o instanceof Employee){
			Employee other=(Employee)o;
			return super.equals((Person)o) && (this.salary==other.salary) && (this.year==other.year) && (this.insuranceNumber==other.insuranceNumber);
		}
		else return false;
	}
	public String toString() {
		return super.toString()+" "+this.salary+" "+this.year + " " + this.insuranceNumber;
	}
	public String getName() {
		System.out.println("Employee name: "+ this.name);
		return this.name;
	}
}
class Manager extends Employee{
	Vector<Employee> team;
	int bonus=0;
	public Manager(String name,double salary, int year, String insuranceNumber, Vector<Employee> team) {
		super(name,salary,year,insuranceNumber);
		this.team=team;
	}
	public String toString() {
		return "Manager: "+ super.toString()+" "+this.bonus+". Team members"+team.toString();
	}
	public boolean equals(Object o) {
		if (o instanceof Manager) {
			Manager other= (Manager)o;
			return super.equals((Employee)(o)) && this.team.equals(other.team);
		}
		else {
			return false;
		}
	}
	public void addEmployee(Employee e) {
		this.team.add(e);
	}
	public void getBonus(int bonus) {
		this.bonus=this.bonus+bonus;
	}
}
public class Ex3 {

	public static void main(String[] args) {
		Employee e1= new Employee("Mark",35000,2017,"1");
		System.out.println(e1.toString());
		Employee e2 = new Employee("Mark",35000,2017,"1");
		System.out.println(e1.equals(e2));		
		Manager m1= new Manager("Mark",35000,2017,"1",new Vector<Employee>());
		m1.addEmployee(e1);
		m1.addEmployee(e2);
		Manager m2= new Manager("Mark",35000,2017,"1",new Vector<Employee>());
		m2.addEmployee(e1);
		m2.addEmployee(e2);
		System.out.println(m1.equals(m2));
		System.out.println(m1.toString());
		m1.getBonus(2);
	}

}
