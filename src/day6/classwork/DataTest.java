package day6.classwork;
import day6.classwork.MyStack;

public class DataTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyStack<Integer> ob=new MyStack<Integer>(5);
		ob.push(30);
		ob.push(10);
		ob.push(45);
		ob.push(67);
		ob.push(70);
		
		ob.push(80);// stack is full-- stack(10)
		
		ob.display();
		/*ob.pop();
		System.out.println("----------------------");
		ob.display();
		
		MyStack<Double> ob2=new MyStack<Double>(10);
		ob2.push(12.35);
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		
		MyStack<Student> st=new MyStack<Student>(5);
		st.push(s1);
		st.push(s2);
		st.push(s4);
		st.push(s3);*/
		
		
		

	}

}