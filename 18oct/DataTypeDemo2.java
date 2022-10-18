import java.util.Scanner;
class DataTypeDemo2
{
	public static void main(String args[])
	{
	  int num1=92;
	  int d= 6;
	  
	  System.out.println("Quotient :"+num1/d);
	  System.out.println("Remainder :"+num1%d); 
	  
	  System.out.println(num1>92);	 
	 
	 int x=6,y=8;
	 System.out.println("And:"+ (x&y)); 
	 System.out.println("OR:"+ (x|y));
	 System.out.println("Not:"+ (~x));
	 System.out.println("XOR:"+ (x^y));
	 
	 boolean status;
	 System.out.println(status= (true&&false));
	 
	System.out.println( (x>=5)||(y>=10));
	
	System.out.println(20<<3); 
	System.out.println(20>>3);
		
	}
}