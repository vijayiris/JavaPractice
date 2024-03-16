package naveenJavaPractice;

import java.util.HashMap;

public class JavaHashMap {

	public static void main(String[] args) {
		
HashMap<String, Integer> people = new HashMap<String, Integer>();

		people.put("Arnav", 8);
		people.put("Anika", 40);
		people.put("Vijay", 39);
		people.put("Rama", 42);

		for(String name : people.keySet()) {
			System.out.println("Keys are  --- " +name);
		}
		
		for(Integer age : people.values()) {
			System.out.println("Values are  --- " +age);
		}
		
		for(String name : people.keySet()) {
			System.out.println("Keys are  --- " +name +"Corresponding values are ----"+people.get(name));
		}

	}
	
}


