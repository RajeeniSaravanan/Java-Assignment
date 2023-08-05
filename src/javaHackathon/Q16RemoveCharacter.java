package javaHackathon;

import java.util.Scanner;

public class Q16RemoveCharacter 
{
	
	private static void stringReverse(String input_str) 
	{
		String output_str = input_str.replace("e", "");
		System.out.println("The output string after removing the given character is : " + output_str);
		
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		
		String input_str = sc.nextLine();
		
		sc.close();
		
		stringReverse(input_str);

	}

	

}
