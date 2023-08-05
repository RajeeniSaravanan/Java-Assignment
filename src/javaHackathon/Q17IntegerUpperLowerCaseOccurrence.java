package javaHackathon;

import java.util.Scanner;

public class Q17IntegerUpperLowerCaseOccurrence 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string with uppercase, lowercase and number:  ");
		String input = sc.nextLine();
		sc.close();
		
		int num =0; 
		int upperCase =0;
		int lowerCase =0;
		
		int length = input.length();
		
		for(int i =0; i< length; i++)
		{
			char character = input.charAt(i);
			
			if(character >= 'A' && character <='Z')
				upperCase++;
			else if(character>= 'a' && character<= 'z')
				lowerCase++;
			else
				num++;

		}
		
		System.out.println("Upper Case letters : " + upperCase);
		System.out.println("Lower Case letters : " + lowerCase);
		System.out.println("Numbers : " + num);
		
	}

}
