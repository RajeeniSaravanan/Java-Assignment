package javaHackathon;

import java.util.Scanner;

public class Q9StringLowerToUpperCase 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string in lowercase : ");
		
		String input_str = sc.next();
		
		sc.close();
		
		String input_uppercase = input_str.toUpperCase();
		
		System.out.println("The input string in upper case is : " + input_uppercase);
			
	}

}


