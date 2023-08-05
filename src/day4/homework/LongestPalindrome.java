package day4.homework;

public class LongestPalindrome 
{
	   public static String findLongestPalindrome(String str) {
	        if (str == null || str.length() < 2) {
	            return str;
	        }
	        
	        String longestPalindrome = "";
	        
	        for (int i = 0; i < str.length(); i++) {
	            // Find odd length palindrome with center at i
	            String oddPalindrome = expandAroundCenter(str, i, i);
	            if (oddPalindrome.length() > longestPalindrome.length()) {
	                longestPalindrome = oddPalindrome;
	            }
	            
	            // Find even length palindrome with center at i and i+1
	            String evenPalindrome = expandAroundCenter(str, i, i + 1);
	            if (evenPalindrome.length() > longestPalindrome.length()) {
	                longestPalindrome = evenPalindrome;
	            }
	        }
	        
	        return longestPalindrome;
	    }

	    private static String expandAroundCenter(String str, int left, int right) {
	        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
	            left--;
	            right++;
	        }
	        return str.substring(left + 1, right);
	    }

	    public static void main(String[] args) {
	        String input = "bcacbdaad";
	        String longestPalindrome = findLongestPalindrome(input);
	        System.out.println("Longest palindrome: " + longestPalindrome);
	    }
	}

	

