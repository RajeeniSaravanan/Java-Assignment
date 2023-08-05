package javaHackathon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q20DuplicatesCount {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the input: ");
    	String inputString = sc.nextLine();
    	sc.close();
    	
        int repeatedIntegers = 0;
        int uppercaseCount = 0;
        int lowercaseCount = 0;

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < inputString.length(); i++)
        {
            char ch = inputString.charAt(i);

            if (Character.isDigit(ch)) 
            {
               
                if (charCountMap.containsKey(ch)) 
                {
                    int count = charCountMap.get(ch);
                    if (count == 1) 
                    {
                        repeatedIntegers++;
                    }
                    charCountMap.put(ch, count + 1);
                } else 
                {
                    charCountMap.put(ch, 1);
                }
            } 
            else if (Character.isUpperCase(ch)) 
            {
                
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) 
            {
                
                lowercaseCount++;
            }
        }

        System.out.println("Total repeated integers: " + repeatedIntegers);
        System.out.println("Total uppercase characters: " + uppercaseCount);
        System.out.println("Total lowercase characters: " + lowercaseCount);
    }
}

