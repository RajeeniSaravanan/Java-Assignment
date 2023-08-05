package day1.homework;

import java.util.Scanner;

public class SwapTest
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number : ");
		int num2 = sc.nextInt();
		
		sc.close();
		
		SwapNumbers obj = new SwapNumbers();
		
		obj.first_num = num1;
		obj.second_num = num2;
		
		obj.swap();

	}

}
