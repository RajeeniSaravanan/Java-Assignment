package javaHackathon;

import java.util.Scanner;

public class Q10StringSubsequence 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		
		StringBuilder str = new StringBuilder(sc.nextLine());
		CharSequence str_sequence = str.subSequence(2, 50);
		
		System.out.println("The subsequence in th given string is : " + str_sequence);
		
	}

}
