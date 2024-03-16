package naveenJavaPractice;

import java.util.Scanner;

public class AddingNumberWithUserInput {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the value of x");
		int x = obj.nextInt();
		
		System.out.println("Enter the value of y");
		int y = obj.nextInt();
		
		int sum = x+y;
		System.out.println("Sum of two user input is----"+sum);
	}

}
