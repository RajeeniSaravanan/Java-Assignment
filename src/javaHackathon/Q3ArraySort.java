package javaHackathon;

import java.util.Arrays;
import java.util.Scanner;

public class Q3ArraySort 
{
	private static void arraySort(int[] array)
	{
			
		Arrays.sort(array);
		
		System.out.print("The elements in the array after sorting : ");
		
		for(int arr: array)
		{
			System.out.print(arr + " ");
		}	
	}    
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		
		int size = sc.nextInt();
		
		int array[] = new int [size];
		
		System.out.println("Enter the elements in the array : ");
	
			for(int i =0; i<size; i++)
			{
				array[i] = sc.nextInt();
			}
			
		sc.close();
			
		System.out.print("The elements in the array before sorting : ");	
		
		for(int arr: array)
		{
			System.out.print(arr + " ");
		}
		
		System.out.println();
		
		arraySort(array);	

	}

}
