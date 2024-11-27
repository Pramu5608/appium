import java.util.Scanner;
public class strong_number {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
int a= sc.nextInt();
int temp =a;
int fact =1;
int sum =0;
int remainder =0;
while(a>0) {
	remainder =a%10;
	for(int i=1;i<=remainder ;i++){
		fact =fact*i;
		}
	sum =sum+fact;
	fact = 1;
	a=a/10;}
	if(sum==temp) {
		System.out.println("the specials number is" +sum);
		
	}
	else {
		System.out.println("the number is not a 145specials number is"+sum);
	}
	
	

	}

}
