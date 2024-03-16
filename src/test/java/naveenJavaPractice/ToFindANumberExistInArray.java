package naveenJavaPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ToFindANumberExistInArray {

	public static void main(String[] args) {
		
		checkingNumberExistingInArrayList(8);


	}
	
	
	public static void checkingNumberExistingInArrayList(int inputValue) {
		
		int[] AarrayList = {1,8,9,3,4,3,7};
		
		for(int i=0;i<=AarrayList.length-1;i++) {
			
			int valuetoBeCompare = AarrayList[i];
			if(valuetoBeCompare == inputValue) {
				
				System.out.println("Entered Number is present in List----");
				break;
				
		}
			System.out.println("Number not present in List");

			
		}	
	   
			}
	
}
