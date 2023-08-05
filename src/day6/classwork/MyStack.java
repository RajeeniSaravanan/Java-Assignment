package day6.classwork;

import java.util.Stack;

//import basic.day1.Student;

public class MyStack <T extends Object>{
	private int size;
	private T[] a;
	private int top;
	
	public MyStack(int s) {
		size=s;
		a=(T[]) new Object[s];
		top=-1;
	}
	public boolean isFull(){
		
		return top==size-1;
	}
	public boolean isEmpty(){
		return top==-1;
	}
	public T peek(){
		return a[top];
	}
	public void push(T item){
		if(isFull())
			System.out.println("can't insert the value");
		else
		{	
			top++;
			a[top]=item;
			System.out.println("item has been inserted");
		}
	}
	public T pop(){
		T deleted=null;
		if(isEmpty())
			System.out.println("no more element left in the stack");
		else{
			deleted=a[top];
			top--;
		}
		return deleted;
	}
	
	public void display(){
		System.out.println("content of stack:");
		int temp=top;
		while(temp>-1){
			System.out.println(a[temp]);
			temp--;
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyStack s=new MyStack(5);
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.display();
		
		//s.push(6);
		
		Integer popped=(Integer)s.pop();
		System.out.println("deleted element is="+popped);
		System.out.println("after popping");
		s.display();
		
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		System.out.println("after popping");
		s.display();
		s.pop();
		
		
	

	}

}
