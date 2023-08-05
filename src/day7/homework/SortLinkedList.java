package day7.homework;
import java.util.Collections;
import java.util.LinkedList;

public class SortLinkedList
{
	    public static void main(String[] args) {
	        // Create a LinkedList
	        LinkedList<Integer> numbers = new LinkedList<>();

	        // Add elements to the LinkedList
	        numbers.add(5);
	        numbers.add(2);
	        numbers.add(8);
	        numbers.add(1);
	        numbers.add(4);

	        // Sort the LinkedList in ascending order
	        Collections.sort(numbers);

	        // Print the sorted LinkedList
	        System.out.println("Sorted numbers in ascending order: " + numbers);
	    }
	}
