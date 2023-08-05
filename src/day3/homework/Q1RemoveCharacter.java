package day3.homework;

public class Q1RemoveCharacter 
{

	public static void main(String[] args) 
	{
		// 10. Write a Java program to remove given characters from the string?
		
		String str = "Welcome to tekarch";
		String str1 = str.replace("e", "");
		System.out.println("Before removing the character : " + str);
		System.out.println("After removing the character : " + str1);

	}

}
