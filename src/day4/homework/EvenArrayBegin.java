package day4.homework;

public class EvenArrayBegin 
{
	
	public static void rearrangeEvenAndOdd(int[] arr1, int arraylength)
	{
		// variables
					int j = -1,temp;
				
					// quick sort method
					for (int i = 0; i < arraylength; i++)
					{
				
						// if array of element
						// is odd then swap
						if (arr1[i] % 2 == 0) 
						{
				
							// increment j by one
							j++;
				
							// swap the element
							temp = arr1[i];
							arr1[i] = arr1[j];
							arr1[j] = temp;
						}
					}
	}
	
	public static void main(String[] args)
	{
		
		 int arr[] = { 12, 10, 9, 45, 2, 10, 10, 45 };
	        int n = arr.length;
	     
	        rearrangeEvenAndOdd(arr, n);
	     
	        for (int i = 0; i < n; i++)
	            System.out.print(arr[i] + " ");
	}
		
}

	


