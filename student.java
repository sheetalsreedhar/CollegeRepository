import java.util.*;
public class student
{
	public static void main(String args[])
	{
		String clgname;
		String name;
		int id;
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your College name:");
			clgname = sc.nextLine();
			System.out.println("Enter Your ID:");
			id = sc.nextInt();
			System.out.println("Enter Your Name:");
			name = sc.nextLine();
			System.out.println("*******************");
			System.out.println("Your College name is:"+clgname);
			System.out.println("Your ID is":+id);
			System.out.println("Your name is"+name);
			
		}
	}
}