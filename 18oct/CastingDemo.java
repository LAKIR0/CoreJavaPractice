import java.util.Scanner;

class CastingDemo
{
	public static void main(String args[])
	{
		short s1= 56;
		short s2= 89;
		
		short sum;
		sum= (short)(s1+s2); 
		
		System.out.println("The sum is :"+sum);
		
		byte b1= 67;
		byte b2 =61;
		
         byte cal= (byte)(b1+b2);
	     
		System.out.println("The calc is :"+cal);
		
		double d1= 89.5;
		double d2= 67.4;
		float dd= (float)(d1+d2);
		System.out.println("The dd is :"+dd);
				
		byte b3=8;
		byte b4=9;
				
		b3+=b4; 
				
		System.out.println("The b3  :"+b3);
				
	}
}