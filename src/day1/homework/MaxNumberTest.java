package day1.homework;

import java.util.Scanner;

public class MaxNumberTest 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int input3 = sc.nextInt();
		
		sc.close();
		
		MaxNumbers obj = new MaxNumbers();
		
		obj.maximum(input1, input2);
		
		obj.maximumNum(input1, input2, input3);

	}

}
