package day1.homework;

import java.util.Scanner;

public class Conversion 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a float number : ");
		float float_input = sc.nextFloat();
		double double_convert = float_input;  //widening typecasting
		System.out.println("The conversion of the float number " + float_input + " to double number is : " + double_convert);
		
		System.out.println("Enter a double number : ");
		double double_input = sc.nextDouble();
		float float_convert = (float)double_input;  //narrowing type casting
		System.out.println("The conversion of the double number " + double_input + " to float number is : " + float_convert);
		
		System.out.println("Enter a integer number : ");
		int integer_input = sc.nextInt();
		long long_convert = integer_input;  //widening typecasting
		System.out.println("The conversion of the integer number " + integer_input + " to long number is : " + long_convert);
		
		System.out.println("Enter a long number : ");
		long long_input = sc.nextLong();
		int integer_convert = (int)long_input;  //narrowing type casting
		System.out.println("The conversion of the long number " + long_input + " to integer number is : " + integer_convert);
		
		sc.close();

	}

}
