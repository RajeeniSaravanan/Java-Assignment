package javaHackathon;

import java.util.Arrays;
import java.util.Scanner;

public class Q25BinarySearch 
{
	private static void binarySearch(int[] arr, int first, int last, int key) 
	{
		 int mid = (first + last)/2;  
		   while( first <= last )
		   {  
		      if ( arr[mid] < key )
		      {  
		        first = mid + 1;     
		      }
		      else if ( arr[mid] == key )
		      {  
		        System.out.println("Element " + key +" is found at index: " + mid);  
		        break;  
		      }else
		      {  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last )
		   {  
		      System.out.println("Element is not found!");  
		   }  
		 }  
		
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 inputs: ");
		
		int arr[] = new int[5];
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The elements in the array are : ");
		
		for(int array: arr)
		{
			System.out.print(array + " ");
		}
		
		Arrays.sort(arr);
		
		System.out.println("\nArrays after sorting : ");
		
		for(int i =0; i< arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\nEnter the key element to search in the array");
		int key = sc.nextInt();
		int first =0;
		int last = arr.length -1;
		
		binarySearch(arr,first,last,key);
		

	}

	

}
