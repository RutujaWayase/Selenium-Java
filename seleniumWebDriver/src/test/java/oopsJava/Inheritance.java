package oopsJava;


/*
Inheritance: in which one object acquires all the properties and behaviour of a parent object
Inheritance represents IS-A relationship.

Syntax:
 class Subclass-name extends Superclass-name{
 //methods and fields
 }
 
 keyword: extends

*/


/*
class Employee{
	float salary = 40000;
}
class Programmer extends Employee{
	int bonus = 5000;
}

public class Inheritance {

		public static void main(String[] args) {
			Programmer p = new Programmer();
			System.out.println("Programmer salary is: "+ p.salary);
			System.out.println("Bonus of Programmer is: "+p.bonus);
		}
}
*/

// 1) Single Inheritance

/*
class Animal{
	void eat() {
		System.out.println("eating");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("barking");
	}
}
public class Inheritance{
	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
		d.eat();
	}
}


*/

/*
 
// 2) Multilevel Inheritance
class Animal{
	void eat() {
		System.out.println("eating");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("barking");
	}
}
class BabyDog extends Dog{
	void weep() {
		System.out.println("weeping");
	}
}
public class Inheritance{
	public static void main(String[] args) {
		BabyDog b = new BabyDog();
		b.weep();
		b.bark();
		b.eat();
	}
}


*/

// 3) Hierarchical Inheritance
class Animal{
	void eat() {
		System.out.println("eating");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("barking");
	}
}
class Cat extends Animal{
	void meow() {
		System.out.println("meowing");
	}
}
public class Inheritance{
	public static void main(String[] args) {
		Cat c = new Cat();
		c.meow();
		c.eat();
	//	c.bark(); // Compile Time Error
		
	}
}