import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) 
	{
		Scanner keyin = new Scanner(System.in);
		System.out.println("Input a number:");
		int a=keyin.nextInt();
		if(a%2==0)
		{
			System.out.println("The input integer is Even Number");
		}
		else
		{
			System.out.println("The input integer is Odd Number");
		}
	}

}
