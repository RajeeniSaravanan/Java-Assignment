package day6.homework;

public class Singleton 
 {

	private static Singleton singleob;
	private Singleton()

	{

		System.out.println("Message from singleton class:");

	}

	public static Singleton getinstance()
	{
		if (singleob==null)
		{
			singleob = new  Singleton();
		}

		return singleob;

	}
 }
	


