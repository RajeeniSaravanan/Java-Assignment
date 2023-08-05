package day4.homework;

//import java.util.Arrays;

public class UniqueElementArray 
{
	    public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 2, 3, 5, 6, 7, 7, 8, 9, 10, 1};

	        int[] uniqueArray = findUniqueElements(array);

	        System.out.println("Unique elements in the array are:");
	        for (int element : uniqueArray) {
	            System.out.print(element + " ");
	        }
	    }

	    public static int[] findUniqueElements(int[] array) {
	        int count = 0;
	        for (int i = 0; i < array.length; i++) {
	            boolean isUnique = true;
	            for (int j = 0; j < array.length; j++) {
	                if (i != j && array[i] == array[j]) {
	                    isUnique = false;
	                    break;
	                }
	            }
	            if (isUnique) {
	                count++;
	            }
	        }

	        int[] uniqueArray = new int[count];
	        int index = 0;
	        for (int i = 0; i < array.length; i++) {
	            boolean isUnique = true;
	            for (int j = 0; j < array.length; j++) {
	                if (i != j && array[i] == array[j]) {
	                    isUnique = false;
	                    break;
	                }
	            }
	            if (isUnique) {
	                uniqueArray[index++] = array[i];
	            }
	        }

	        return uniqueArray;
	    }
	}


