package naveenJavaPractice;

public class NaveenInterviewquestion1 {

	public static void main(String[] args) {
     
		String[] str = {"a","b","c"};
		//String[] str = {};
		String joinedStr = String.join(":", str);
		String joinedStr1 = String.join("", str);
		//System.out.println(joinedStr1);
		//System.out.println(joinedStr);
		System.out.println(joinString("!!",str));
	}
	
	
	public static String joinString(String seprator, String[] inputArray) {
		
		StringBuilder sb = new StringBuilder();
		int end = 0;
		for(String s: inputArray) {
			if(s!=null) {
				
				sb.append(s);
				end = sb.length();
				sb.append(seprator);
				
			}
			
		}
		
		return sb.substring(0, end);
	}

}
