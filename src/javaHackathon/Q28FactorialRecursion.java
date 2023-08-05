package javaHackathon;

public class Q28FactorialRecursion 
{
	public int fact(int input)
		{
			if(input == 0)
				return 1;
				
			int fact_result = input*(fact(input-1));
			return fact_result;
		}
		
}


