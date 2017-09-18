class Animal{
	int numberofanimal=0;
	public Animal() {
		numberofanimal++;
	}
	public String show() {
		return "Animal";
	}
	public String name(String name) {
		return "Name of Animal is "+name;
	}
}
class Dog extends Animal{
	int numberofdog=0;
	public Dog() {
		super();
		numberofdog++;
	}
	public String show() {
		return "Dog";
	}
	public String name(String name, String owner) {
		return "Name of the Dog "+name+"and his owner is"+owner;
	}
	
}
class Cat extends Animal{
	int numberofcat=0;
	public Cat() {
		super();
		numberofcat++;		
	}
	public String show() {
		return "Cat";
	}
	public String name(String name, String owner, String breed) {
		return "Name of the Dog "+name+"and his owner is"+owner+"The breed of this cat"+breed;
	}
}

public class Ex1 {
	public static void main(String[] args) {
		
	}

}
