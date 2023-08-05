package javaHackathon;

import java.util.Scanner;

public class Q23DifferentiateInput 
{
	private static boolean integerCheck(String input) 
	{
		try
		{
			Integer.parseInt(input);
			return true;
		}
		catch(NumberFormatException e) 
		{
			return false;
		}
	}
	
	private static boolean booleanCheck(String input) 
	{
		if(input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false"))
				return true;
				
		else
			return false;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input: ");
		String input = sc.nextLine();
		boolean isInt = integerCheck(input);
		boolean isBool = booleanCheck(input);
		
		if(isInt)
		{
			System.out.println("The given input is Integer");
		}
		else if(isBool)		
		{
			System.out.println("The given input is boolean");
		}
		else
		{
			System.out.println("The given input is string");
		}
		
		System.out.println("Program completed");
	}
	
}
