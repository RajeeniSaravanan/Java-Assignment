package day7.homework;

import java.util.LinkedList;
import java.util.Collections;

public class AscendindOrderLIst
{
	    public static void main(String[] args) {
	        // Create a LinkedList to store the integers
	        LinkedList<Integer> linkedList = new LinkedList<>();

	        // Add 5 integer values to the LinkedList
	        linkedList.add(5);
	        linkedList.add(2);
	        linkedList.add(4);
	        linkedList.add(1);
	        linkedList.add(3);

	        // Sort the LinkedList in ascending order
	        Collections.sort(linkedList);

	        // Print the sorted LinkedList
	        System.out.println("Sorted LinkedList: " + linkedList);
	    }
	}

