import java.util.*;
class EvenOddDemo
{
	public static void main(String args[])
	{
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter number:");
		
		int num= sc.nextInt();
				
		if((num%2)==0)
			System.out.println("The number "+num+" is even");
		else
		   System.out.println("The number "+num+" is odd");
	   
	     
		
		
	}
}