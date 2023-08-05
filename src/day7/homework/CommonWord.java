package day7.homework;

import java.util.HashMap;
import java.util.Map;

public class CommonWord 
{
	public static void main(String[] args) 
	{
	    String input = "red blue red green pink white pink red blue";

	    String mostCommonWord = findMostCommonWord(input);
	    System.out.println("Most common word: " + mostCommonWord);
	}



public static String findMostCommonWord(String input) {
    // Split the input string into words
    String[] words = input.split("\\s+");

    // Create a HashMap to store the word frequencies
    Map<String, Integer> wordFrequencies = new HashMap<>();

    // Count the frequency of each word
    for (String word : words) {
        wordFrequencies.put(word, wordFrequencies.getOrDefault(word, 0) + 1);
    }

    // Find the most common word
    String mostCommonWord = "";
    int maxFrequency = 0;

    for (Map.Entry<String, Integer> entry : wordFrequencies.entrySet()) {
        if (entry.getValue() > maxFrequency) {
            mostCommonWord = entry.getKey();
            maxFrequency = entry.getValue();
        }
    }

    return mostCommonWord;
}
}

