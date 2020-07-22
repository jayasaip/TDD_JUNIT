package Task8;
import java.util.Scanner;

public class Application {
	public static void main( String[] args )
    {
        System.out.println("Enter the string:");
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        RemoveTwoAs rm = new RemoveTwoAs();
        System.out.println(rm.DelA(st));
        sc.close();
    }
}
