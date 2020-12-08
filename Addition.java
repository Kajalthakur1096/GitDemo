import java.io.IOException;
import java.util.Scanner;

public class Addition {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("Addition of "+a+" and "+b+" is " +c);
		sc.close();
	}

}
