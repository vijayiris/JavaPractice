package naveenJavaPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterator {

	public static void main(String[] args) {
		
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(2);
		number.add(4);
		number.add(6);
		number.add(12);
		number.add(14);

		Iterator<Integer> it = number.iterator();
		//System.out.println(number);
		while(it.hasNext()){
			Integer i = it.next();
			if(i >10) {
				System.out.println(i);	
				it.remove();
			}
				
		}
		System.out.println(number);
		
	}

}
