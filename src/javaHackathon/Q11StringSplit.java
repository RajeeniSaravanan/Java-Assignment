package javaHackathon;

import java.util.Scanner;

public class Q11StringSplit 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		
		String input_str = sc.nextLine();
		sc.close();
		
		String[] split_str = input_str.split("e");
		for(String s : split_str)
		{
			System.out.println(s);
		}
		System.out.println("second way of split method:");
		String[] split_str1 = input_str.split("e", 3);
		for(String str : split_str1)
		{
			System.out.println(str);
		}
		
	}

}
