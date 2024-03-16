package naveenJavaPractice;

public class UpperCaseString {

	public static void main(String[] args) {
		String s = "i am giving interview today";
		String FinalString= "";
		String s1[] = s.split(" ");
		for(String s2 :s1) {
			String firstLetter = s2.substring(0, 1).toUpperCase();
			String restLetters = s2.substring(1);
			
			String appended = firstLetter+restLetters+" ";
			FinalString = FinalString+appended;		 
		}
		
		 System.out.println(FinalString);
		 System.out.println(FinalString.equalsIgnoreCase(s));
	}

}
