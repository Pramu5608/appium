package exception;

import java.lang.reflect.Array;

public class count {

	public static void main(String[] args) {
	 String s = "AABBAAC"; 
	 m1(s);
	 }
	public static void m1( String s){
		
		 int count = 1;
	        for (int i = 0; i < s.length() - 1; i++) {
	            // Check if current character is equal to the next one
	            if (s.charAt(i) == s.charAt(i + 1)) {
	                count++; // Increment count if consecutive characters are duplicates
	            } else {
	                // If consecutive characters are not duplicates, print count and reset it to 0
	                if (count > 0) {
	                    System.out.println(s.charAt(i) + " - " + count);
	                    count = 1;
	                }
	            }
	        }
	        // Check for duplicates at the end of the string
	        if (count > 0) {
	            System.out.println(s.charAt(s.length() - 1) + " - " + count);
	        }
	    }
	}
	 
	 

	
