package exception;

public class arithmeticExcetion {

	public static void main(String[] args) {
		int x=10;
		int y =0;
		try {
			System.out.println(x/y);
		}
		catch(ArithmeticException c){
			System.out.println(c.getMessage());
		}
System.out.println("hi");
	}

}
