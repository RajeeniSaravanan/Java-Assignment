package day3.homework;

public class Q11RemoveSpace 
{

	public static void main(String[] args) 
	{
		// 11. Write a Java program to remove all the white spaces from a given string.
		
		String str ="Welcome to tekarch";
		System.out.println("The string Before removing white space : " + str);
		System.out.println();
		
		//Using replace method
		String str1 = str.replace(" ", "");
		System.out.println("After removing the white space in the string : " + str1);
		System.out.println();
		
		
		//Using split method
		String[] str2 = str.split("\\s+");
		System.out.println("REmoving white space in the string using split method is : ");
		for(String s : str2)
		{
			System.out.print(s);
		}
	}

}
