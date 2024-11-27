package javaPractice;

public class fiboceSeries {

	public static void main(String[] args) {
		int a =1;
		int b =2;
		int sol;
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<6;i++) {
			
			sol=a+b;
			a=b;
			b=sol;
		
			System.out.println(b);

		}
		
	}

}
