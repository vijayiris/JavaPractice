package naveenJavaPractice;

import java.util.ArrayList;
import java.util.Collections;

public class JavaArrayList {

	public static void main(String[] args) {
		
  ArrayList<String> cars = new ArrayList<>();
  cars.add("Maruti");
  cars.add("Toyota");
  cars.add("Range Rover");
  cars.add("Suzuki");
  cars.add("Nissan");
  Collections.sort(cars);
  cars.remove(0);
  for(String i:cars) {
	  
	  System.out.println(i);
  }
  
  cars.add("Maruti");
  for(String i:cars) {
	  
	  System.out.println("New Car List  ----  " +i);
  }
 
	}

}
