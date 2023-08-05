package day2.homework;

import java.util.Arrays;

public class ArraySort 
{

	public static void main(String[] args) 
	{
		int[] array1 = {300,400,700,600,50,200};
		int[] array2 = {300,400,500,10,20,30};
		Arrays.parallelSort(array1);
//		for(int i=0;i<array1.length;i++)
//		{
//			System.out.println(array1[i]);
//		}
		
		for(int n:array1) {
			System.out.print(n + " ");
		}
		
		System.out.println();
		int index = Arrays.binarySearch(array1, 400);
		System.out.println("Key element found in th index: " + index);
				
		int compareArray = Arrays.compare(array1, array2);
		System.out.println(compareArray);
		
		Arrays.parallelSort(array2, 1, 4);
		System.out.println(Arrays.toString(array2));
	}

}
