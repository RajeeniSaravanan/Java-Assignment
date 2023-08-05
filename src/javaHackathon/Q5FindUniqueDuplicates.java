package javaHackathon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q5FindUniqueDuplicates
{

public static void main(String[] args)
{
	
	Scanner sc = new Scanner(System.in);
	
	//System.out.println("Enter the size of the array");		
	//int n = sc.nextInt();
	
	int array[] = new int[6];
	
	System.out.println("Enter 6 numbers of an array");
	
	for(int i =0; i<array.length; i++)
	{
		array[i] = sc.nextInt();
	}
	
	int frequency[] = new int[array.length];
	var uniqueNumbers = new ArrayList<Integer>();
	
	
	// Calculate frequency of every number in array.
	for(int i=0; i< array.length; i++)
	{
		int num = array[i];
		int count =1;
		
		for(int j = i+1; j<array.length; j++)
		{
			if(num == array[j]) 
			{
				count++;
				frequency[j] = -1;			//-1 temporary indicator for duplicate 
			}
		}
		
		if(frequency[i] != -1)
		{
			frequency[i] = count;
		}
	}
	
	// Based on the frequency, find out the unique and duplicate numbers 
	for(int i =0; i< array.length; i++)
	{
		if(frequency[i]!= -1)
		{
			if(frequency[i] == 1)
			{
				// unique number 
				uniqueNumbers.add(array[i]);
			}
			else
			{
				// duplicate number  
				System.out.println("Number " + array[i] + " occured " + frequency[i] + " times");
			}
		}
	}

	if(uniqueNumbers.size() > 0)
	{
		System.out.println("Unique numbers: " + Arrays.toString(uniqueNumbers.toArray()));
	}		
}

}

