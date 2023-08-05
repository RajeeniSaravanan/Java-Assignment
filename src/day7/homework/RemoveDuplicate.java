package day7.homework;
import java.util.LinkedHashSet; 

public class RemoveDuplicate 
{
	    public static void main(String[] args) {
	        String input = "sri rajeeni sudha";
	        String result = removeDuplicates(input);
	        System.out.println(result);
	    }

	    public static String removeDuplicates(String str) {
	        // Convert the string to a character array
	        char[] chars = str.toCharArray();

	        // Create a LinkedHashSet to preserve the order of characters
	        LinkedHashSet<Character> charSet = new LinkedHashSet<>();

	        // Add each character to the set
	        for (char c : chars) {
	            charSet.add(c);
	        }

	        // Build the resulting string from the set
	        StringBuilder sb = new StringBuilder();
	        for (char c : charSet) {
	            sb.append(c);
	        }

	        return sb.toString();
	    }
	}
