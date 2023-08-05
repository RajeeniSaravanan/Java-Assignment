package day3.homework;

public class StringBufferDemo 
{
	public static void main(String[] args)
	{
		StringBuffer buffer = new StringBuffer("java");
		int n = buffer.length();
		System.out.println(n);
		
		buffer.append(false);
		System.out.println(buffer);
		
		char[] arr = {'a','b','c'};
		
		buffer.append(arr);
		System.out.println(buffer);
		
		int n1 = buffer.capacity();
		System.out.println(n1);
		
		System.out.println(buffer.charAt(2));
		
		System.out.println(buffer.reverse());
		
	StringBuilder builder = new StringBuilder("welcome");
	builder.reverse();
	System.out.println(builder);
		
	}
}
