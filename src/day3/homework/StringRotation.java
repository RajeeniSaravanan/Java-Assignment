package day3.homework;

public class StringRotation 
{

	public static void main(String[] args) 
	{
		// 14. Write a Java program to check if a given text is a rotation of another text
		//example : "aana" is rotation of "naaa"
		
		String str1 = "aanam";
		String str2 ="naaa";
		System.out.println("Checking a string is rotaion of another: ");
		
		if(checkrotation(str1,str2)) 
		{
			System.out.println("Yes " + str2 + " is rotaion of" + str1);
		}
		else
		{
			System.out.println("No " + str2 + " is not rotation of " + str1);
		}

	}

	private static boolean checkrotation(String str1, String str2) {
		if(str1.length()!= str2.length())
		return false;
		
		String concatenated_str = str1+str1;
		if(concatenated_str.contains(str2))
			return true;
		else return false;
	}

}
