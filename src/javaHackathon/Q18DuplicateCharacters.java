package javaHackathon;

import java.util.Scanner;

public class Q18DuplicateCharacters 
{

	private static void duplicateWords(String str)
	{
	
		int count;
		String[] words = str.split("\\s+");

		for (int i = 0; i < words.length; i++)
		{

			count = 1;

			for (int j = i + 1; j < words.length; j++) 
			{
				if (words[i].equalsIgnoreCase(words[j])) 
				{

                count++;
                //words[j] = "";
				}
			}
			
        if (count != 1)
  
        	System.out.println(words[i]);
        }
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
 
        duplicateWords(str);
        sc.close();

	}

	

}
