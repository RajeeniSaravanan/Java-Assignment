package javaHackathon;

import java.util.Scanner;

public class Q14StringReverse 
{
	public Q14StringReverse(String str)
	{
		String[] input_split = str.split("\\s");
		int str_size = input_split.length;
		
		System.out.println("REverse of the given string is : ");
		
		for(int i = str_size-1; i>=0; i--)
		{
			System.out.print(input_split[i] +" ");
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse : ");
		
		String str = sc.nextLine();
		
		sc.close();
		
		Q14StringReverse obj = new Q14StringReverse(str);

	}
}
