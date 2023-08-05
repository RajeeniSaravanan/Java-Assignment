package day2.homework;
import java.util.Scanner;

public class StudentDetails 
{

	public static void main(String[] args) 
	{
		Student[] stuArray = new Student[5];  //
		
		Scanner sc = new Scanner(System.in);
		System.out.println("**Enter the student details**");
		
		for(int i=0; i<5;i++)
		{
			System.out.println("Enter Student_id: ");
			int id = sc.nextInt();
			
			System.out.println("Enter Student name: ");
			String name = sc.next();
			
			System.out.println("Enter phone number: ");
			long phone_no = sc.nextLong();
			
			System.out.println("Enter the country: ");
			String country = sc.next();
			
			stuArray[i] = new Student(id,name,phone_no,country);  //initialize Student objects using Constructor
		}
		
		System.out.println("Details of all the students : ");
		
		for(Student s : stuArray)
		{
			System.out.println("Student Id: " + s.id + " Name : " + s.name + " Phone number : " + s.phone_no + " Country : " + s.country);
		}
		sc.close();

	}
}
