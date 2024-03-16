package naveenJavaPractice;

public class AddingArrayElements {

	
	public static void main(String[] args) {
		int sum = 0;
		int[] InputArray = {1,4,8,9,5,6,6,7};
		
		for(int i=0;i<=InputArray.length-1;i++) {
			oddAndEvenFunction(InputArray[i]);
			 sum = sum+InputArray[i];
		
		}
		System.out.println("Sum of all input arrays  is  ----" +sum);
	}
	
	public static void oddAndEvenFunction(int num ) {
		
		if(num>=2 && num%2==0) {
			System.out.println("Number is Even");
		}else {
			System.out.println("Number is Odd");
			
		}
		
	}

}
