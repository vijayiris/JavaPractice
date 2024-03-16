package naveenJavaPractice;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class JavaLinkedList {

	public static void main(String[] args) {
		LinkedList<String>  cars= new LinkedList<>();
		cars.add("Maruti");
		cars.add("Armada");
		cars.add("Hyundai");
		cars.add("TaTa");
		cars.add("BMW");
		cars.add("Toyota");
        Collections.sort(cars);

		//System.out.println(cars.getFirst());
		//System.out.println(cars.getLast());
		//cars.removeFirst();
		for(String i: cars) {
			
			System.out.println("Printing car list-----" +i);
		}
		
        cars.removeFirst();
        cars.removeLast();
		
		for(String i: cars) {
			
			System.out.println("Printing car list  After REmoving First ands Last item from LinkedList  -----" +i);
		}
        
	}
  
}
;