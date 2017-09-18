import java.util.Vector;

class Person{
	  Gender gender;
	  public Person(Gender gender) {
		  this.gender=gender;
	  }
	public String toString()
	{
		return gender.toString();
}
}
public class DragonLaunch {
	static int counter=0;
	static Vector<Person> v1= new Vector<Person>();
	
	public static void kindap(Person p) {
		v1.addElement(p);
	}
	public static boolean willDragonEatorNot() {
		
		for (int i=0; i<v1.size(); i++) {
			if (v1.get(i).gender==Gender.BOY) {
				counter++;
			}
			if (v1.get(i).gender==Gender.GIRL) {
				counter--;
			}
			if (counter<0) {
				break;
			}
		}
			return counter!=0;
			
			/**if (change) {
				i=0;
				change=false;
			}
			if (i+1==v1.size()) {
				break;
			}
			if (v1.get(i).gender==Gender.BOY && v1.get(i+1).gender==Gender.GIRL) {
				v1.remove(i);
				v1.remove(i);
				change=true;
				i=0;
				}	
			}
		if (v1.size()!=0) {
			System.out.println("YES");
			}
		else {
			System.out.println("NO");
			}
		}
		System.out.println(v1.toString());*/
		}	
	}
	public static void main(String[] args) {
		
		Person p1 = new Person(Gender.BOY);
		Person p2 = new Person(Gender.GIRL);
		Person p3 = new Person(Gender.BOY);
		Person p5 = new Person(Gender.GIRL);
		Person p6 = new Person(Gender.GIRL);
		kindap(p1);
		kindap(p2);
		
		kindap(p3);
		//kindap(p4);
		kindap(p5);
		//kindap(p6);
		willDragonEatorNot();
		
	}

}
