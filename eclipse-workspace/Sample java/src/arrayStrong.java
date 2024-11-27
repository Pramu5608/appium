import java.util.Scanner;

public class arrayStrong {
public static void main(String []args) {
	ss();
	
}
public static void ss() {
	int tem =0, tem2=0;
	int sum =0,rem=0;

	Scanner sc = new Scanner(System.in);	
	System.out.println("Enter the size of the Arr");
	int size = sc.nextInt();
	int arr[] = new int[size];
	System.out.println(" Enter the ele");
	for(int i=0;i<arr.length;i++) {
		
		arr[i]=sc.nextInt();
		
	}
	for(int i=0;i<arr.length;i++){
		//System.out.println(arr[i]);
		tem=arr[i];
		//System.out.println(tem);
		while(tem>0) {

//System.out.println(arr[i]);
 rem = tem%10;
//System.out.println(arr[i]);
 //ystem.out.println(rem);
 sum = sum+rem*rem*rem;
 
 //System.out.println(sum);
 

 tem=tem/10;
 
 
	}
		tem2=sum;
	//	System.out.println(tem2);
		
		sum=0;

	if(tem2==arr[i]) {
		
		System.out.println(" the number"+arr[i]+" is Amstrong " +tem2);
	}
	else{
		System.out.println(" the number"+arr[i]+" is not a Amstrong " +tem2);	
	}}

}}
