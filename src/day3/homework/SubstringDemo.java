package day3.homework;

public class SubstringDemo 
{
	//13.Write a Java program to find all the substrings of a given string.
	 
	public static void main(String[] args) {
		
		String str = "Rajeeni";
		
		for(int i=0;i<str.length();i++)
		{
			System.out.println("The substring " + i + " is : " + str.substring(i));
		}

	}

}
