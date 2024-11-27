
public class palindromNumber {

	public static void main(String[] args) {
	int num =121, sum =0,rem=0;
	int temp =num;
	while(num>0) {
		rem = num%10;
		sum = (sum*10)+rem;
		num = num/10;
	}
	if(temp==sum) {
		System.out.println("The number is a palindrom number"+temp);
	}
	else {
		System.out.println("The number is not a palindrom number"+temp);
		
	}

	}

}
