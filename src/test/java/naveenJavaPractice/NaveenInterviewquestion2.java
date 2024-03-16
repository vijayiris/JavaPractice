package naveenJavaPractice;

public class NaveenInterviewquestion2 {

	public static void main(String[] args) {
		
		String x= "abc";
		String y = "abc";
		x.concat(y);
		System.out.println(x);
		number(1);
	}
    
	
	public static void number(int num) {
		
		//int num =1;
		if(num<=100) {
			System.out.println(num);
			num++;
			number(num);
		}
		
		
	}
	
	     
}
