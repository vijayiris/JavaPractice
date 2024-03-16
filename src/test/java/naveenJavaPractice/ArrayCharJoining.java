package naveenJavaPractice;

public class ArrayCharJoining {

	public static void main(String[] args) {
		
		String con = "";
		String[] inputArray = {"a", "g","h","l"};
		for(int i=0;i<=inputArray.length-1;i++) {
			
			 con=con+inputArray[i]+"&";
		}
		System.out.println("Length os String after Appen  --" +con.length());
		System.out.println("String after Con=  "+con.substring(0,con.length()-1));
	}

}
