package javaHackathon;

import java.util.Scanner;

public class Q8StringUpperCaseToLowerCase 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string in uppercase : ");
		
		String input_str = sc.next();
		
		sc.close();
		
		String input_lowercase = input_str.toLowerCase();
		
		System.out.println("The input string in upper case is : " + input_lowercase);
		
		
	}

}
