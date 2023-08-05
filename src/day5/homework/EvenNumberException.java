package day5.homework;

	import java.util.Scanner;

	// Custom exception class for handling odd numbers
	class OddNumberException extends Exception
	{
	    public OddNumberException(String message) 
	    {
	        super(message);
	    }
	}

	public class EvenNumberException {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            try {
	                System.out.print("Enter an even number: ");
	                int number = scanner.nextInt();

	                if (number % 2 != 0) {
	                    throw new OddNumberException("You entered an odd number. Please enter an even number.");
	                }

	                System.out.println("You entered an even number.");
	                break;  // Exit the loop if an even number is entered

	            } catch (OddNumberException e) {
	                System.out.println(e.getMessage());
	                scanner.nextLine();  // Clear the input buffer
	            } catch (Exception e) {
	                System.out.println("Invalid input. Please enter a valid integer.");
	                scanner.nextLine();  // Clear the input buffer
	            }
	        }

	        scanner.close();
	    }
	}


