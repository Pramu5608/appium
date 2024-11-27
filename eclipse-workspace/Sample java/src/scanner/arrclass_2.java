package scanner;
import java.util.Scanner;
public class arrclass_2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
System.out.println("Enter the arr size");
 int Size = sc.nextInt();
 int[] arr = new int[Size];
 System.out.println("Enter the Array elements");
 for(int i=0;i<arr.length;i++) {
	 arr[i]=sc.nextInt();
 }
 for(int i=0;i<arr.length;i++) {
	 if(arr[i]%2==0) {
		 arr[i]=arr[i]+1;
		 
	 }
	 else if (arr[i]%3==0) {
		 arr[i]=arr[i]-1;
	 }
	 System.out.println("the arr is " +arr[i]);
 }
 
	}

}
