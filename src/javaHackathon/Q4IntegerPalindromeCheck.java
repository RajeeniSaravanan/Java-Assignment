package javaHackathon;

import java.util.Scanner;

public class Q4IntegerPalindromeCheck 
{
	private static void checkPalindrome(int[] arr, int size) 
	{
		int check =0;
		
		for(int i =0; i<size/2; i++)
		{
			if(arr[i]!=arr[size-i-1])
			{
				check = 1;
				break;
			}	
		}
				
		if(check == 1)
		{
			System.out.println("Array is Not Palindrome");
		}
		
		else
		{
			System.out.println("Array is Palindrome");
		}
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter the elements: ");
		for(int i=0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		checkPalindrome(arr,size);
	}
}
