package day5.homework;

public class LinearSearchDemo 
{

	public static void main(String[] args) 
	{
		// search an given key in the array of size n using 
		//linear or sequential search
		
		int arr[] = {10,30,20,50,60,70};
		int key = 2;
		LinearSearchDemo obj = new LinearSearchDemo();
		System.out.println(key + " found at the index : " + obj.searchKey(arr, key));;
	}

	private  int searchKey(int[] arr, int key) 
	{
		for(int i =0; i<arr.length; i++)
		{
			if(arr[i]==key)
			{
				return i;
			}
			
		}
		return -1;
		
	}

}
