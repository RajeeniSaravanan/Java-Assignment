package day3.homework;

import java.util.Arrays;

public class AnagramDemo 
{

	public static void main(String[] args) 
	{
		// 15.  Write a Java program to check if two given strings are anagrams of each other
		String str1 = "Vennila";
		String str2 = "Vennila";
		boolean bool = anagram(str1,str2);
		
		System.out.println("The two given strings " + str1 + " and " + str2 + " are anagrams : " + bool);
		

	}

	private static boolean anagram(String str1, String str2) {
		
		if(str1.length()!= str2.length())
		return false;
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 =str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		//System.out.println(Arrays.equals(arr1, arr2));
		return Arrays.equals(arr1, arr2);
		}
	

}
