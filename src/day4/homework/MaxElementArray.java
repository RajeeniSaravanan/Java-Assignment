package day4.homework;

public class MaxElementArray 
{

	public static void main(String[] args) 
	{
		// find maximum element in the array
		
		int arr[] = {10,70,20,90,40,60};
		int maxi = max_array(arr);	
		System.out.println("The maximum element in the array is : " + maxi);

	}

	private static int max_array(int[] arr) 
	{
		int max = arr[0];
		
		for(int i =1; i< arr.length; i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
			
		}
		return max;
		
		
	}

}
