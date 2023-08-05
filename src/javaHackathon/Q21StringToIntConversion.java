package javaHackathon;

import java.text.NumberFormat;
import java.util.Scanner;

public class Q21StringToIntConversion 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		
			try 
			{
			String str = sc.nextLine();	
			int num = Integer.parseInt(str);
			System.out.println("The string to integer conversion is :" + num);
			}
			catch(NumberFormatException e)
			{
				System.out.println("The given input is not valid...Please enter a valid input");
				
			}
			sc.close();		
	}

}
