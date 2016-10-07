import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) 
	{
		String a,b;
		Scanner keyin = new Scanner(System.in);
		System.out.println("Enter a string 1:");
		a=keyin.nextLine();
		System.out.println("Enter a string 2:");
		b=keyin.nextLine();
		if(a.equalsIgnoreCase(b))
		{
			System.out.println("The two strings are the same.");
		}
		else
		{
			System.out.println("The two strings are not the same.");
		}
	}

}
