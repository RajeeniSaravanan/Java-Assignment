package day2.homework;

import java.util.Scanner;

public class OverloadingExample 
{
    public void area(int side)
    {
    	int square_area = side*side;
    	System.out.println("Area of the square is : " + square_area);
    } 
    
    public void area(int length, int width)
    {
    	int rectangle_area = length*width;
    	System.out.println("Area of the rectangle is : " +rectangle_area);
    }
	
	
	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the side of the square: ");
		int side = sc.nextInt();
		
		System.out.println("Enter the length of the rectangle: ");
		int length = sc.nextInt();
		
		System.out.println("Enter the width of the rectangle: ");
		int width = sc.nextInt();
		
		sc.close();
		
		OverloadingExample obj = new OverloadingExample();
		obj.area(side);
		obj.area(length,width);
		
	}

}
