package day2.homework;

import java.util.Scanner;

public class MatrixDemo
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows: ");
		int row = sc.nextInt();
		
		System.out.println("Enter the number of columns: ");
		int column = sc.nextInt();
		
		int matrix[][] = new int[row][column];
		
		//To read the elements in the matrix from user
		
		for(int i =0; i<row; i++)
		{
			for (int j =0;j<column;j++)
			{
				System.out.println("Enter elements: ");
				matrix[i][j] = sc.nextInt();
			}
		}
		
		//To print the elements in the matrix
		
		System.out.println("The matris is: ");
		System.out.println("***************");
		
		for(int i =0; i<row; i++)
		{
			for (int j =0;j<column;j++)
			{
				System.out.print(matrix[i][j] + " \t");
				
			}
			System.out.println();
		}
		sc.close();
	}

}
