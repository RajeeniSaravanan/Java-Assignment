package day4.homework;

import java.util.Scanner;

public class ArrayAddition 
{

	public static void main(String[] args) 
	{
		// add all the elements in the given array of size n

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter the elements of the array : ");
		
		for(int i=0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		
		}
		sc.close();
		
		System.out.println("The elements in the given array is : ");
		
		for(int i=0; i<size; i++)
		{
			System.out.print(arr[i] +" ");
		}
		
		System.out.println();
		System.out.println("The sum of the elements in the given array is : " + ArrayAddition.sum(arr));
		
	}

	private static int sum(int[] arr) 
	{
		int add =0;
		for(int i =0;i< arr.length; i++) 
		{
			add = add + arr[i];
			
		}
		return add;
	}
	

}
