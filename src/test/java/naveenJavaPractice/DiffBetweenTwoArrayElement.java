package naveenJavaPractice;

public class DiffBetweenTwoArrayElement {

	public static void main(String[] args) {
		
		String[] InputArray  = {"the", "quick", "brown", "fox", "quick"};
		
		int ans =getIndexValueOf(InputArray, "the", "quick");
		System.out.println("Diff after subtraction is   -----"   +ans);

	}
	public static int getIndexValueOf(String[] s, String word1, String word2) {
		
		int indexofword1 = 0 ;
		int  indexofword2  =0;
		for(int i=0;i<=s.length-1;i++) {
			if(s[i].equals(word1)) {
				System.out.println("Index of Word1 is ----" + i);
				 indexofword1 =i;
			}else if(s[i].equals(word2)){
				System.out.println("Index of Word2 is ----" + i);
				 indexofword2 =i;
				break;
			}

			
		}
		
		int diff  = indexofword2- indexofword1;
		return diff;
	}
	
	
}
