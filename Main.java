import java.util.Scanner;

public class Main {
	
	public static void main (String[] args)
	{
		System.out.println("enter date");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		UserMainCode d = new UserMainCode();
		int i = UserMainCode.getValidDate(s);
		if(i ==1)
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("invalid");
		}
	}

}
