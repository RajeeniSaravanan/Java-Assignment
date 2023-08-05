package javaHackathon;

import java.util.Scanner;

public class FactorialTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to find the factorial : ");
		int num = sc.nextInt();
		sc.close();
		Q2FactorialNonRecursion obj = new Q2FactorialNonRecursion();
		
		//int factorial = obj.fact(num);
		//System.out.println("The factorial of the number " + num + " is : " + factorial);
		
		Q28FactorialRecursion obj2 = new Q28FactorialRecursion();
		
		int factorial_number = obj.fact(num);
		System.out.println("The factorial of the number " + num + " is : " + factorial_number);
		

	}

}

