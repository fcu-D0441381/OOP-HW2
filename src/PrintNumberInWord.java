import java.util.Scanner;

public class PrintNumberInWord {

	public static void main(String[] args) 
	{
		Scanner keyin =new Scanner(System.in);
		System.out.println("Enter a integer:");
		int a=keyin.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("\"Oen\"");
			break;
		case 2:
			System.out.println("\"Two\"");
			break;
		case 3:
			System.out.println("\"Three\"");
			break;
		case 4:
			System.out.println("\"Four\"");
			break;
		case 5:
			System.out.println("\"Five\"");
			break;
		case 6:
			System.out.println("\"Six\"");
			break;
		case 7:
			System.out.println("\"Seven\"");
			break;
		case 8:
			System.out.println("\"Eight\"");
			break;
		case 9:
			System.out.println("\"Nine\"");
			break;
		default :
			System.out.println("\"Other\"");
		}
		
	}
}