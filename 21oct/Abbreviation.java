/*
Program: WAP to find abbreviate
@author: levis kiro
@Date: 21 oct 2022  
*/

//Declaring scanner package
import java.util.Scanner;
//declaring a class
class Abbreviation
{
	static void print(String abbr)
	{
		
		
		//switch case
		switch(abbr)
		{
		case "lol" -> System.out.println("laugh out loud");
		case "asap" -> System.out.println("as soon as posiible");
		case "ttyl" -> System.out.println("talk to you later");
		case "tbh" -> System.out.println("to be honest");
		case "pto" -> System.out.println("please turn over");
		default->System.out.println("wrong input");
		}
	}
	public static void main(String args[])
	{
		String input;
	    System.out.println("to options are lol asap ttyl tbh pto");
		Scanner sc=new Scanner(System.in); //declaring the object of scanner
		input=sc.next();
		print(input);
	}
}

	