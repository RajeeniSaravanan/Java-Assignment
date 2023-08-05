package day3.homework;

public class Q3IntegerToString 
{
	
	public static void main(String[] args) 
	{
		// 3. convert int to string.
		
		int number = 100;
		String str = Integer.toString(number);  //Method1
		
		System.out.println("The Integer to string conversion is " + str);
		
		int n=200;
		String str1 = String.valueOf(n);
		
		System.out.println("The Integer to string conversion is " + str1);
	}

}
