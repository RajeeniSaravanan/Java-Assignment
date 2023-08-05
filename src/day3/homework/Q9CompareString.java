package day3.homework;

public class Q9CompareString 
{

	public static void main(String[] args) 
	{
		// 9. check if two strings are the same ignoring their cases.
		
		String str1 = "Hello World";
		String str2 = "hello world";
		
		//Ignoring case sensitive
		System.out.println("The given two strings are equal : " + str1.equalsIgnoreCase(str2)); 
		
		//case sensitive
		System.out.println("The given two strings are equal : " + str1.equals(str2));

	}

}
