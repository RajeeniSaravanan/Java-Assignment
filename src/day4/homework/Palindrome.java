package day4.homework;

import java.util.Arrays;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		String input = "morning";
		
		String reverse_input="";
		
		System.out.println("The given string is : " + input);
		
		for(int i = input.length()-1; i>=0;i--)
		{
			reverse_input = reverse_input + input.charAt(i);
		}
		
		System.out.println("The reverse of the given string is : " + reverse_input);
		
		if(input.equals(reverse_input))
		{
			System.out.println("\nThe given string is palindrome");
		}
		else
			System.out.println("\nThe given string is not palindrome");
	}

}
