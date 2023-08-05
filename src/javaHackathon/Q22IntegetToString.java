package javaHackathon;

import java.util.Scanner;

public class Q22IntegetToString 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		sc.close();
		
		String str1 = Integer.toString(number);
		System.out.println("The given integer to string conversion is : " + str1);
		
		
		String str = String.valueOf(number);
		System.out.println("The given integer to string conversion is : " + str);
		
	}

}
