package day2.homework;

import java.util.Scanner;

public class FibonacciNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the fibonacci series : " );
		int size = sc.nextInt();
		
		sc.close();
		
		FibonacciNumber obj = new FibonacciNumber();
		obj.findFibonacci(size);
	}

	private void findFibonacci(int n) 
	{
		int first = 0;
		int second = 1;
		int third;
		
		for(int i=1; i<=n; i++)
		{
			System.out.print(first + " ");
			third = first+second;
			first = second;
			second = third;		
		}	
	}
}
