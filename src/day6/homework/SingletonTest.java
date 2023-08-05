package day6.homework;

public class SingletonTest
{
	public static void main(String[] args)
	{
		System.out.println("Message from the singleton TEST class:\n");

		System.out.println("\nPrint the instance: \n" +Singleton.getinstance());

		

		Singleton.getinstance();

		

		System.out.println("\n" +Singleton.getinstance());

		Singleton.getinstance();

		

		Singleton.getinstance();

		Singleton.getinstance();

		System.out.println("\n" +Singleton.getinstance());

	}

}
