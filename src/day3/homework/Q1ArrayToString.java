package day3.homework;

import java.util.Arrays;

//1. convert an array to string in Java.
public class Q1ArrayToString
{
	public static void main(String[] args)
	{
		int arr[] = {100,200,300,400,500};
		String array_conversion;
		
		array_conversion = Arrays.toString(arr);
		System.out.println("Array to String conversion is :" + array_conversion);
		
		char charr[] = {'a','b','c','d'};
		String char_conversion = Arrays.toString(charr);
		System.out.println("Char Array to String conversion is :" + char_conversion);
		
		boolean boo[] = {true,true,false};
		String s =Arrays.toString(boo);
		System.out.println(s);		
	}

}
