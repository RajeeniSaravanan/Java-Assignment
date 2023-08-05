//package day2.homework;

//import java.util.Scanner;

//public class OverloadingDemo 
//{
//
////	public OverloadingDemo()
////	{
////		System.out.println("Default constructor called");
////	}
//	
////	public OverloadingDemo(int side)
////	{
////		int area = 
////	}	
////	public OverloadingDemo(int length, int width) 
////	{
////		
////	}
//
//	public static void main(String[] args) 
//	{
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the side of the square: ");
//		int side = sc.nextInt();
//		
//		System.out.println("Enter the length of the rectangle: ");
//		int length = sc.nextInt();
//		
//		System.out.println("Enter the width of the rectangle: ");
//		int width = sc.nextInt();
//		
//		//OverloadingDemo obj = new OverloadingDemo();
//		//OverloadingDemo obj2 = new OverloadingDemo(side);
//		//OverloadingDemo obj3 = new OverloadingDemo(length,width);
//		
//		var squareShape = new Shape(side);
//		System.out.printf("Area of the square: %s", squareShape.GetArea());
//		
//		var rectangleShape = new Shape(length, width);
//		System.out.printf("Area of the rectangle: %s", rectangleShape.GetArea());	
//	
//	}
//
//}
//
//
//public class Shape
//{
//	public enum ShapeType {Square, Rectangle};
//	public ShapeType MyShape;
//	
//	int sideOfSquare, lengthOfRectangle, widthOfRectangle;
//	
//	public Shape(int side)
//	{
//		this.sideOfSquare = side;
//		this.MyShape = ShapeType.Square;
//	}
//		
//	public Shape(int length, int width)
//	{
//		this.lengthOfRectangle = length;
//		this.widthOfRectangle = width;
//		this.MyShape = ShapeType.Rectangle;
//	}
//	
//	public int GetArea()
//	{
//		if(this.MyShape == ShapeType.Square)
//		{
//			return this.sideOfSquare * this.sideOfSquare;
//		}
//		else if(this.MyShape == ShapeType.Rectangle)
//		{
//			return this.lengthOfRectangle * this.widthOfRectangle;
//		}			
//	}	
//}
//
