import java.util.*;
class AverageThreeNumber
{
	public static void main(String args[])
	{
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter marks of a student");
	  System.out.println("Marks of maths");
	  float num= sc.nextFloat();
	  System.out.println("Marks of Science");
	  float num1= sc.nextFloat();
	  System.out.println("Marks of English");
	  float num2= sc.nextFloat();
	  
	  float total=num+num1+num2;
	  float percentage=(total/300)*100;
	  
	  
	  if(percentage>=40)
	  System.out.println("Congratulation you have Passed");
	  
	  else
	  System.out.println("Sorry you have Failed");
	  }
}
	  