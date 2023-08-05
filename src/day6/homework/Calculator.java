package day6.homework;

public class Calculator 
{
//Create calculator class with simple methods and convert the class into JAR file
	
	int input1;
	int input2;

	
	public void add() 
	{
		int sum = input1+input2;
		System.out.println("The sum of two numbers is " + sum);
	}
	
	public void subtract() 
	{
		int subtract = input1-input2;
		System.out.println("The difference of two numbers is " + subtract);
	}
	
	public void multiply() 
	{
		int product = input1*input2;
		System.out.println("The product of two numbers is " + product);
	}
	
	public void divide() 
	{
		int quotient = input1/input2;
		System.out.println("The quotient of two numbers is " + quotient);
	}
	
}
