package day1.homework;

public class SwapNumbers 
{
	int first_num;
	int second_num;
	int temp;


public void swap()
{
	System.out.println("The numbers before swapping is ");
	System.out.println("First number is : " + first_num);
	System.out.println("Second number is : " + second_num);
	
	temp = first_num;
	first_num = second_num;
	second_num = temp;
	
	System.out.println("The numbers after swapping is ");
	System.out.println("First number is : " + first_num);
	System.out.println("Second number is : " + second_num);
}

public void swapWithoutVariable()
{
	System.out.println("The numbers before swapping is ");
	System.out.println("First number is : " + first_num);
	System.out.println("Second number is : " + second_num);
	
	first_num = second_num -first_num;
	second_num = first_num;
	first_num = first_num +second_num;
	
	System.out.println("The numbers after swapping is ");
	System.out.println("First number is : " + first_num);
	System.out.println("Second number is : " + second_num);
	
}
}
