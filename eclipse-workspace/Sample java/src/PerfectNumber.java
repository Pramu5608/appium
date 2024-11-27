
public class PerfectNumber {

	public static void main(String[] args) {
		int num =8;
		int sum =0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum = sum+i;
			}
		}
		if(num==sum) {
			
			System .out.println("The perfect number"+num);
		}
		else {
			System .out.println(num+ ":the is not a perfect number");
		}
		

	}

}
