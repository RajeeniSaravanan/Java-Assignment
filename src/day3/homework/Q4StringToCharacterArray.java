package day3.homework;

public class Q4StringToCharacterArray 
{

	public static void main(String[] args) 
	{
		// 4. convert string to char array
		
		String str ="Welcome";
		char[] arr = str.toCharArray();
		System.out.println("Conversion of string to char array is :");
		for(char s : arr)
		{
			System.out.println(s);
		}

	}

}
