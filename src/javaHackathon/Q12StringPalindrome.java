package javaHackathon;

public class Q12StringPalindrome 
{

	public static void main(String[] args) 
	{
		String str ="MalayalaM";
		System.out.println("The given string is : " + str);
		
		String reverse ="";
		for(int i= str.length()-1; i>=0; i--)
		{
				reverse = reverse + str.charAt(i);
		}
		
		System.out.println("The reverse of the given string is : " + reverse);
		
		if(str.equals(reverse))
		{
			System.out.println("Palindrome");
		}
		
		else
		{
			System.out.println("Not palindrome");
		}

}
}
