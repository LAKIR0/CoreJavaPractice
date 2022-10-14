import java.util.Scanner;
class AverageScan
{ 
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your first number: ");
	int a= sc.nextInt();
    System.out.println("Enter your second number: ");
	int b= sc.nextInt();
	System.out.println("Enter your third number: ");
	int c= sc.nextInt();
	int avg = (a + b + c)/3;
	///////////////////////////////////
	System.out.println("the average of 3 numbers is: "+avg);
	}
}
	
	
	
	
	