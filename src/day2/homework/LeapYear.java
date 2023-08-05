package day2.homework;

import java.util.Scanner;

public class LeapYear 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the year to check whether it is leap year :");
		int year = sc.nextInt();
		
		sc.close();
		
		LeapYear obj = new LeapYear();
		obj.findLeap(year);
		

	}

	private void findLeap(int year) 
	{
		if(year%4 ==0)
		System.out.println(year + " is leap year. ");
		
		else
		System.out.println(year + " is not leap year. ");
	}

}
