package day1.homework;

public class MaxNumbers 
{
	int max;
	
	protected void maximum(int num1, int num2)
	{
		// finding using ternary operator
		max = (num1>num2)?num1:num2;
		System.out.println("The maximum of two numbers is: " + max);
		
		
		max = Math.max(num1, num2);
		System.out.println("The maximum of two numbers is: " + max);
		
	}
	
	public void maximumNum(int num1,int num2,int num3)
	{
		max = (num1>num2)?((num1>num3)?num1:num3):((num2>num3)?num2:num3);
		System.out.println("The maximum of the numbers " + num1 +"," + num2 + " and " +num3 + " is : " + max );
		
		max = Math.max(Math.max(num1, num2), num3);
		System.out.println("The maximum of the numbers " + num1 +"," + num2 + " and " +num3 + " is : " + max );
		
	}
}
