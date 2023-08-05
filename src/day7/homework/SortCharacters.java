package day7.homework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCharacters
{
	    public static void main(String[] args) {
	        String input = "kreadiac";
	        
	        List<Character> charList = new ArrayList<>();
	        for (char c : input.toCharArray()) {
	            charList.add(c);
	        }
	        
	        Collections.sort(charList);
	        
	        StringBuilder sortedString = new StringBuilder(charList.size());
	        for (Character c : charList) {
	            sortedString.append(c);
	        }
	        
	        System.out.println("Original string: " + input);
	        System.out.println("Sorted string: " + sortedString.toString());
	    }
	}
