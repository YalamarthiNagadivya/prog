import java.util.*;
public class ExceptionTry {
     public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	{
	try {
		int x=Integer.parseInt(sc.next());
		int y=sc.nextInt();
		int z=x/y;
		System.out.println(z);
	}
	catch (ArithmeticException ae) {
		System.out.println(ae.getMessage());
		ae.printStackTrace();
	}
	catch (InputMismatchException i) {
		System.out.println(i.toString());
	}
	catch (NumberFormatException n){
		System.out.println(n.toString());
	}
	}
}
}
