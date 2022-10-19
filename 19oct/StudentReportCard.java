import java.util.Scanner;

class StudentReportCard
{
	
	static void calcPercentage(float m1,float m2, float m3)
	{
		float percentage;
		
		percentage= ((m1+m2+m3)/300)*100;
		
		calcGrade(percentage);
		
	}
	
	static void calcGrade(float percentage) 
	{	
	  char grade;
		
		if(percentage>=85)
	     	 grade='A';
		 else if(percentage>=70)
			  grade='B';
		      else if(percentage>=55)
				    grade='C';
	                 else if(percentage>=40)
                           grade='D';
                           else
                             grade='F'; 
	
        if(grade=='F')
	      System.out.println("Sorry!! You have failed..");
	   else
            System.out.println("You have cleared the exam with grade:"+grade);		

       
		printRemarks(grade);
		
	}
	
	static void printRemarks(char gr) 
	{	
	
	   switch(gr)
	   {
		   case 'A':System.out.println("Excellent performance...");
		          break;
		   case 'B':System.out.println("Very Good...");
		          break;
		   case 'C':System.out.println("Good...can do better");
		          break;
		   case 'D':System.out.println("Fair.. Need to work very hard");
		          break;
		   case 'F':System.out.println(" Better luck next time");
		          break;
		  default: System.out.println("Wrong input");
				  
	   }
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		 
		float marks1,marks2,marks3;
		
		System.out.println("Enter the marks of subject1:");
		marks1= sc.nextFloat();
		System.out.println("Enter the marks of subject2:");
		marks2= sc.nextFloat();
		System.out.println("Enter the marks of subject3:");
		marks3= sc.nextFloat();
		
		calcPercentage(marks1,marks2,marks3);
	    
	}
}