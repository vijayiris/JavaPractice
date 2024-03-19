package naveenJavaPractice;

import java.util.Arrays;

public class RemovingMatchingArrayElement {

	public static void main(String[] args) {
		
        int[] arr = {2,4,9,6,9,7,11};
        RemoveElement(arr, 9);

	}
	
	public static void RemoveElement(int[] initialArray, int numberTobeRemoved) {
		
		
		int[] newArray = new int[initialArray.length];		
		for(int i=0, k=0;i<=initialArray.length-1;i++) {
			if(initialArray[i]!= numberTobeRemoved) {
				newArray[k] = initialArray[i];
				k++;
			}
			
		}
		
        System.out.println("Before deletion :" + Arrays.toString(initialArray));
        System.out.println("After deletion :" + Arrays.toString(newArray));
		
	}

}
