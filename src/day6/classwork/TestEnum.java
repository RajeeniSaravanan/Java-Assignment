package day6.classwork;

import java.util.Scanner;

public class TestEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age group");
		String val=sc.next();
		AgeGroup group=AgeGroup.valueOf(val.toUpperCase());
		
		switch(group){
		case BABY: System.out.println("this is baby");
						break;
		case KID: System.out.println("this is kid");
					break;
		case ADULT: System.out.println("this is adult");
						break;
		default : System.out.println("wrong input");
		}
		

	}

}