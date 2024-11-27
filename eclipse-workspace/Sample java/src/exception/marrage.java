package exception;

import java.util.Scanner;

public class marrage {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	System.out.println("Enter the gender");
	char gender = sc.next().charAt(0);
	System.out.println("Enter the Age");
	int age = sc.nextInt();
	
	if((gender=='m'&& age>=18)||(gender=='f'&& age>=18)) {
		System.out.println("you are elegeble to vote");
	}
	else {
	try {
		throw new notElegebleToGetMarry();
	
		}
	catch(notElegebleToGetMarry e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	}

}
