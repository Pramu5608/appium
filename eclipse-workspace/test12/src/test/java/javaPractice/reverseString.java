package javaPractice;

public class reverseString {

	public static void main(String[] args) {
		String s = "pramod";
		String rev = "";
		
		for(int i= s.length()-1;i>=0;i--) {
			
rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		///or string builder or string buffer
		
		StringBuilder s1 = new StringBuilder("mohan");
		s1.reverse();
		System.out.println(s1);
		
		StringBuffer s2 = new StringBuffer("sathish");
		s2.reverse();
		System.out.println(s2); 
		

	}

}
