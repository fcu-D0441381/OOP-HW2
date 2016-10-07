import java.io.Console;
import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) 
	{
		Scanner keyin = new Scanner(System.in);
		System.out.println("Input a number:");
		int a=keyin.nextInt();
		System.out.println("Enter a float point number:");
		float b=keyin.nextFloat();
		System.out.println("Enter your name:");
		String c=keyin.next();
		System.out.print("Hi "+c+" the multiplication of "+a+" and "+b+" is ");
		System.out.printf("%.2e",a*b);	

	}

}
