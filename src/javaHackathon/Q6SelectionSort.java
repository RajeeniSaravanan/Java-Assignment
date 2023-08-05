package javaHackathon;

import java.util.Scanner;

public class Q6SelectionSort 
{

	private static void selectionSort(int[] arr)
	{
		int smallest;
		for(int i =0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					smallest = arr[j];
					arr[j] = arr[i];
					arr[i] = smallest;
				}
				
			}
			
		}
		System.out.println("\nSorted elements in the array are : ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] +" ");
		}
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements in the array: ");
		for(int i =0; i<size;i++)
		{
			arr[i] = sc.nextInt();
			
		}
		
		System.out.println("The elements in the array are :" );
		for(int num : arr)
		{
			System.out.print(num + " ");
		}
		
		selectionSort(arr);
		
	}
}
