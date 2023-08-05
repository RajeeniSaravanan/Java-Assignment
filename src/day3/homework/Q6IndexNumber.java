package day3.homework;

public class Q6IndexNumber 
{

	public static void main(String[] args) 
	{
		// 6. find the index of given character or substring(first character index)
		
		String str = "Hello World";
		char ch ='l';
		System.out.println("The index number of the given character is: " + str.indexOf(ch));
		
		//Index of the substring
		
		String substring = "orld";
		System.out.println("Index of the substring starts at the position : " + str.indexOf(substring) );

	}

}
