package day1.homework;

public class FactorialNumber 
{
    
	//Using recursion
	
	/*public int fact(int input)
	{
		if(input == 0)
			return 1;
			
		int fact_result = input*(fact(input-1));
		return fact_result;
	}
	*/
	
	//Using for loop
	public int fact(int input)
	{
		int fact_result= 1;
		for(int i =1; i<=input;i++)
		{
			fact_result = fact_result*i;
		}
		return fact_result;
	}
	
}
