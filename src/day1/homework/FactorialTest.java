package day1.homework;

import java.util.Scanner;

public class FactorialTest 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to find the factorial : ");
		int num = sc.nextInt();
		sc.close();
		FactorialNumber obj = new FactorialNumber();
		
		int factorial = obj.fact(num);
		System.out.println("The factorial of the number " + num + " is : " + factorial);

	}

}
