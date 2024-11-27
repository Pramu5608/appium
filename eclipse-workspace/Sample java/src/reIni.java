
public class reIni {
   public reIni() {
	   this(10);
	   System.out.println("inside A" );
   }
   public reIni(int a) {
	   System.out.println("inside B" +a);
   }
   public static void main(String[]args) {
	   reIni re =new reIni();
   }
}
