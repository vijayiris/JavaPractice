package naveenJavaPractice;




public class ReversingString {
	public static String input= "Hello";
	public static String Rev = "";

	public static void main(String[] args) {
		reverseUsingStringBuilder("vijay");
		for(int i=0;i<=input.length()-1;i++) {
			System.out.println("Character at ith position " +input.charAt(i));
			Rev = input.charAt(i)+ Rev;
		}
		System.out.println(Rev);

	}
	
	public  static void reverseUsingStringBuilder(String input) {
		
		StringBuilder SB = new StringBuilder(input);
		System.out.println("Input String  ==="+SB.toString());
		String rev = SB.reverse().toString();
		System.out.println("After Reverse by Builder ---"+rev);
		
	}

}
