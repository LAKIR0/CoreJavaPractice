import java.util.Scanner;

class DataTypeDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a character:");
		
		char charValue = sc.next().charAt(0);
		
		int asciiValue= charValue;
	    
		System.out.println("The Ascii value of "+ charValue + " is: "+asciiValue );
		
		int num1=9;
		num1= num1+1; 
		
		int number1= 67;
		int sum= number1++;
		System.out.println("value of sum using number1++ :"+ sum);
		
		int number2= 67;
		 sum= ++number2;
		System.out.println("value of sum using ++number2 :"+ sum);
		
		int n=1;
		System.out.println("Not n :"+ ~n);
		
		boolean status = true;
		System.out.println("!Status : "+ !status);
				
	}
}