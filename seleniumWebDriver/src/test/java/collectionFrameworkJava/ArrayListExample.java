package collectionFrameworkJava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	
	public static void main(String[] args) {
	/*	ArrayList<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Pinapple");
		list.add("Guava");
		System.out.println(list);
	*/	
	
//Iterating ArrayList using Iterator
  /*	ArrayList<String> list = new ArrayList<String>();
	list.add("Mango");
	list.add("Apple");
	list.add("Pinapple");
	list.add("Guava");
	Iterator itr = list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
  
   */
		
//Iterating ArrayList using For-each Loop
	/*	ArrayList<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Pinapple");
		list.add("Guava");
		for(String fruit : list) {
			System.out.println(fruit);
		}
	*/
		
		
//Get and Set ArrayList
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Pinapple");
		list.add("Guava");
		System.out.println("Returning element: "+list.get(1));
		list.set(1, "Grapes");
		for(String fruit:list) {
			System.out.println(fruit);
		}
	}
	
}
