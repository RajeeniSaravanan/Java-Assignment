package day3.homework;

public class UpperCaseDemo 
{
	public static void stringformat(String input)
	{
		String[] words = input.split("\\s");
		String capitalize = "";
		
		for(int i = 0; i < words.length ; i++)
		{
			String first = words[i].substring(0, 1);
			String rem_letters = words[i].substring(1);
			capitalize = capitalize + first.toUpperCase() + rem_letters +" ";
			
		}
		
		System.out.println("The input after capitalize is: ");
		System.out.println(capitalize);
	}
}
