package day7.homework;
import java.util.HashMap;
import java.util.Map;

public class CharacterFrequencyCollection
{
	   public static void main(String[] args) {
	        String str = "sri rajeeni sudha";
	        Map<Character, Integer> frequencyMap = new HashMap<>();

	        // Convert the string into an array of characters
	        char[] charArray = str.toCharArray();

	        // Iterate over each character in the array
	        for (char c : charArray) {
	            if (frequencyMap.containsKey(c)) {
	                // Character already exists in the map, increment its frequency by 1
	                frequencyMap.put(c, frequencyMap.get(c) + 1);
	            } else {
	                // Character does not exist in the map, add it with a frequency of 1
	                frequencyMap.put(c, 1);
	            }
	        }

	        // Print the frequencies of each character
	        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }
	    }
	}


