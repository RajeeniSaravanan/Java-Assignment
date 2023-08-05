package day7.homework;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class UniqueWord 
{
	 static void printUniqueWords(String str)
	    {
	        // Create a new Map by creating object of HashMap
	        // class
	        HashMap<String, Integer> map
	            = new LinkedHashMap<String, Integer>();
	 
	        // Extract words from string
	        // using split() method
	        String[] words = str.split("\\s");
	 
	        // Iterating over the words array
	        // using for each loop
	        for (String word : words) {
	 
	            // If the word is present in array then
	            //
	            if (map.containsKey(word)) {
	 
	                //  Increment its value by one
	                // using map.get() method
	                map.put(word, map.get(word) + 1);
	            }
	 
	            // Else store the word inside map
	            // with value one
	            else
	                map.put(word, 1);
	        }
	 
	        // Iterate over the map using for each loop
	        for (Map.Entry<String, Integer> entry :
	             map.entrySet()) {
	 
	            // If value of words equals unity
	            if (entry.getValue() == 1)
	 
	                // Print all those words
	                System.out.println(entry.getKey());
	        }
	    }
	 
	    // Method 2
	    // Main driver method
	    public static void main(String[] args)
	    {
	        // Custom input string
	        String str = "Welcome to geeks for geeks";
	 
	        // Calling the Method1 to
	        // print all unique words in above string
	        printUniqueWords(str);
	    }
}

