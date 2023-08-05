package day4.homework;

public class ArraySumElement 
{
	
	public int sum(int[] inputarray)
	{
		int length =  inputarray.length;
		int sum =0;
		
		for(int i =0; i<length; i++)
		{
			sum+= inputarray[i];
		}
		
		return sum;	
	}
	
	private void elementSum(int[] arr, int array_sum)
	{
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = arr[i] +array_sum;
		}
		
		for(int i : arr)
		{
			System.out.println(i);
		}

	}
	
	public static void main(String[] args) 
	{
		
		ArraySumElement obj = new ArraySumElement();
		
		int arr[] = {3,1,5,4,7,2};
		int array_sum = obj.sum(arr);
		System.out.println("The sum of elements in the array is : " + array_sum);
		
		obj.elementSum(arr,array_sum);
	}

}
