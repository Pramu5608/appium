package javaPractice;

import java.util.ArrayList;

public class uniqueNumber {

	public static void main(String[] args) {
		int arr[] = {1,1,2,3,3,3,4};
		
		ArrayList<Integer>ab = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			int k=0;
			if(!ab.contains(arr[i])) {
				
				ab.add(arr[i]);
				k++;
				
				for(int j=i+1;j<arr.length;j++) {
					
					if(arr[i]==arr[j]) {
						k++;
					}
				} 
				System.out.println(arr[i]);
				System.out.println(k);
				if(k==1) {
					
					System.out.println("The Unique number is "+arr[i]);
					}
				
			}
			
		}
		
		
		

	}

}
