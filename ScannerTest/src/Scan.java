import java.util.Scanner;
public class Scan 
{
	public void scannerMethod() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Hey there, what is your name?");

		String name = sc.nextLine();
		System.out.println("Hello, " +name + ", nice to meet you.\nhow old are you?");
		String age = sc.next();

		if (name.equals("Bob")) 
		{
			System.out.println("OK");
		}

		sc.close();
	}
}
