package naveenJavaPractice;

public class JavaException {

	public static void main(String[] args) {
		try {
		int[] number = {1,2,3};
		System.out.println(number[10]);
		}catch (Exception e) {
			System.out.println("Some Exception Happened");
		}finally {
			System.out.println("Finally code will exceute irrespective of Try Catch result");
		}
		access(20);
	}
	
	static void access(int age) {
		if(age<18) {
			throw new ArithmeticException("Age Less than 18 Access Denied");
		}else {
			System.out.println("Access Granted");
			
		}
		
	}

}
