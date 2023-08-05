package day2.homework;

import java.util.Scanner;

public class NumberPattern
{

	public static void main(String[] args) 
	{
		/*4.Print following patterns

		a. If n=4 then   o/p= 6 9 12 15
		b. if n=5 then   o/p= 1,4,7,10,13
		c. If n=5 then   o/p= 0,4,8,12,16
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of pattern");
		int n = sc.nextInt();
		
		sc.close();
		
		switch(n)
		{
		case 4:
			{
			int start =6;
			int increment = 3;
			for(int i=0; i<n; i++)
				{
				System.out.print(start + " ");
				start = start + increment;
				}
			break;
			}
			
		case 5:
			{
			int start = 1;
			int increment = 3;
			for(int i=0;i<5;i++)
				{
				System.out.print(start + " ");
				start = start + increment;
				}
			break;
			}
		
		case 6:
			{
				int start =0;
				int increment =4;
				for(int i=0; i<n-1;i++)
				{
					System.out.print(start +" ");
					start = start + increment;
				}
				break;
			}
			
			default:
			System.out.println("Invalid size input");
		}
			

	}
}
