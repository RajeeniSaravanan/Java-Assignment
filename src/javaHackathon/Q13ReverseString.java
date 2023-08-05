package javaHackathon;

import java.util.Scanner;

public class Q13ReverseString 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse : ");
		
		String str = sc.nextLine();
		
		sc.close();
		char[] string_char = str.toCharArray();
		
		int length = string_char.length;
		String reverse_str ="";
		
		for(int i =length-1; i>=0; i--)
		{
			reverse_str = reverse_str +string_char[i];
		}
		
		System.out.println("The reverse of the given input string is :  " + reverse_str);

	}

}
