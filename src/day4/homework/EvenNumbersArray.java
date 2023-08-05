package day4.homework;

public class EvenNumbersArray 
{

	public static void main(String[] args) 
	{
		//print only even numbers in the given array

		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i =0;i<arr.length;i++) 
		{
			if(arr[i]%2 ==0)
			{
				System.out.println(arr[i]);
			}
		}
		
	}

}
