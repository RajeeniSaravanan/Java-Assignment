package day7.homework;
import java.util.LinkedList;

public class DuplicateRemoveList
{
	    public static void main(String[] args) {
	        LinkedList<Integer> linkedList = new LinkedList<>();

	        // Adding elements to the LinkedList
	        linkedList.add(5);
	        linkedList.add(10);
	        linkedList.add(15);
	        linkedList.add(10); // Duplicate element
	        linkedList.add(20);

	        System.out.println("Original LinkedList: " + linkedList);

	        // Removing duplicates from the LinkedList
	        removeDuplicates(linkedList);

	        System.out.println("LinkedList after removing duplicates: " + linkedList);
	    }

	    private static void removeDuplicates(LinkedList<Integer> linkedList) {
	        // Create a temporary LinkedList to store unique elements
	        LinkedList<Integer> tempLinkedList = new LinkedList<>();

	        for (Integer element : linkedList) {
	            // Add the element to the temporary LinkedList if it's not already present
	            if (!tempLinkedList.contains(element)) {
	                tempLinkedList.add(element);
	            }
	        }

	        // Clear the original LinkedList and add the unique elements back
	        linkedList.clear();
	        linkedList.addAll(tempLinkedList);
	    }
	}

