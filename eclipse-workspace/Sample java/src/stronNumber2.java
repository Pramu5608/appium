import java.util.Scanner;

public class stronNumber2 {

	public static void main(String[] args) {
		strong();
		
	}
		
		public static void strong() {
			Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int tem =num;
		int sum =0;
		int rem =0;
		while (tem>0) {
			rem = tem%10;
			sum =sum+rem*rem*rem;
			tem =tem/10;
			
		}
		if (num==sum) {
			
			System.out.println("the number is amstrong number" + +sum);
		}
		else {
			
			System.out.println("the number is not a amstrong number" + +sum);
		}

	

}
}
