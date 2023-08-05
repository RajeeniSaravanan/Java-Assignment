package day3.homework;

import java.util.Scanner;

public class Q12UpperCase 
{

	public static void main(String[] args) 
	{
		// 12.Write a Java program to capitalize the first letter of each word in a given string.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input sentence");
		
		String str = sc.nextLine();
		
		UpperCaseDemo.stringformat(str);
		
		sc.close();
	}

}
