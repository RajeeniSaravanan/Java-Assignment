package day5.homework;
import java.util.Arrays;

public class BinarySearchDemo 
{
	   public static void main(String[] args) {
	   int[] array = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
	   int key = 23;
	   int result = binarySearch(array, key);
	        if (result == -1) {
	            System.out.println("Key not found in the array");
	        } else {
	            System.out.println("Key found at index " + result);
	        }
	    }

	    public static int binarySearch(int[] array, int key) {
	        int low = 0;
	        int high = array.length - 1;

	        while (low <= high) {
	            int mid = (low + high) / 2;
	            if (array[mid] == key) {
	                return mid;
	            } else if (array[mid] < key) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }

	        return -1; // Key not found
	    }
	}
