import java.util.*;
class CheckVoting
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age to check eligibility");
		int num = sc.nextInt();
		
		if(num>=18)
			System.out.println("Person can Vote");
		else
			System.out.println("Person cannot Vote");
	}
}