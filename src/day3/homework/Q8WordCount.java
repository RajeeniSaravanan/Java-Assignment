package day3.homework;

public class Q8WordCount 
{

	public static void main(String[] args) 
	{
		// 8. count the number of words in a given string sentence?
		String str = "Welcome to tekarch class";
		String[] count = str.split("\\s+");
		int words = count.length;
		System.out.println("Number of words in the sentence is : " + words);

	}

}
