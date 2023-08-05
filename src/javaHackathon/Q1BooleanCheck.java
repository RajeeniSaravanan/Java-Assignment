package javaHackathon;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1BooleanCheck
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three boolean inputs : ");
		int boolean_count =0;
		try
		{
			boolean boolean_input1 = sc.nextBoolean();
			boolean boolean_input2 = sc.nextBoolean();
			boolean boolean_input3 = sc.nextBoolean();
			
			sc.close();
			
			if(boolean_input1)
			{
				boolean_count++;
			}
			if(boolean_input2)
			{
				boolean_count++;
			}
			if(boolean_input3)
			{
				boolean_count++;
			}
			if(boolean_count>=2)
			{
				System.out.println("Success: Met expected output");
			}
			
			else
			{
				System.out.println("Failure: Didnot meet expectation");
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input is not valid..Enter the valid input");
		}	
		
	}

}
