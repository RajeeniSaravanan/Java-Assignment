package javaHackathon;

public class Q2FactorialNonRecursion 
{
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

