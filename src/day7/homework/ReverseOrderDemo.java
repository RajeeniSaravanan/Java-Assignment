package day7.homework;
import java.util.LinkedList;

public class ReverseOrderDemo
{
	    public static void main(String[] args) {
	        LinkedList<String> strings = new LinkedList<>();

	        // Add string elements to the list
	        strings.add("First");
	        strings.add("Second");
	        strings.add("Third");
	        strings.add("Fourth");

	        // Print the elements in reverse order
	        while (!strings.isEmpty()) {
	            System.out.println(strings.removeLast());
	        }
	    }
	}
