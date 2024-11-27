package javaPractice;

public class numberOfOcceranceOfChar {

	public static void main(String[] args) {
		
		//int count = numberOf("abbccdd",'c');
		
		occerane("aaaddnndd");
	}

	private static int numberOf(String word, char c) {
		int count=0;
		for (int i=0;i<word.length();i++) {
			
			if(word.charAt(i)==c) {
			count++;	
			}
		}
		System.out.println("The occerance of"+" " + c +" "+"in the word is"+" "  +count );
		return 0;
	}
	
	
	public static void occerane(String word2) {
		String word3 = word2;
		
		for(int i=0;i<word3.length();i++) {
			int count=0;
			for(int j=0; j<word3.length();j++) {
				
				if(word2.charAt(i)==word3.charAt(j)) {
					count++;
					
				}
			}
			System.out.println("Occerance of " +word3.charAt(i)+" "+count);
		}
		
		//System.out.println("Occerance of " +word3.charAt(i)+" "+count);
		
	}

}
