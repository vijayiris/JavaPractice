package naveenJavaPractice;

import java.util.HashSet;

public class JavaHashSet {

	public static void main(String[] args) {
		HashSet<Integer> number = new HashSet<Integer>();
		number.add(1);
		number.add(5);
		number.add(5);
		number.add(7);
		number.add(10);
		number.add(3);
		number.add(3);
		number.add(3);
		
		
		System.out.println(number.size());
		for(int i=0;i<=10;i++)
		{
if(number.contains(i)) {
	System.out.println(i +"--Number present");
	
}else
{
	System.out.println(i + "---Number not present");
	
}
			
		}

	}

}
