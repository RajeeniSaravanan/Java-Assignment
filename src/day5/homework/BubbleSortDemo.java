package day5.homework;

public class BubbleSortDemo
{

	public static void main(String[] args) 
	{
      int[] myarr = {5,3,8,4,6};
      
      System.out.println("Array before sorting: ");
      
      for(int i =0; i<myarr.length; i++)
      {
    	  System.out.print(myarr[i] + " ");
      }
      
      System.out.println();
      
      BubbleSortDemo myobj = new BubbleSortDemo();
      myobj.sortedArray(myarr);
      
      System.out.println("Array after sorting : ");
      for(int i=0; i<myarr.length; i++)
      {
    	  System.out.print(myarr[i] + " ");
      }
      

	}

	private void sortedArray(int[] myarr) 
	
	{
		int temp = 0;
		int n = myarr.length;
		
		for(int i =0; i<n; i++)
		{
			for(int j=1; j< n-i; j++)
			{
				if(myarr[j-1] > myarr[j])
				{
					temp = myarr[j-1];
					myarr[j-1] = myarr[j];
					myarr[j] = temp;		
				}
			}
		}	
		
	}

}
