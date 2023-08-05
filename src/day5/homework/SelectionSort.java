package day5.homework;

public class SelectionSort
{

	    public static void main(String[] args) {
	        int[] array = {5, 2, 8, 3, 1};
	        
	        System.out.println("Original array:");
	        printArray(array);
	        
	        selectionSort(array);
	        
	        System.out.println("\nSorted array:");
	        printArray(array);
	    }
	    
	    public static void selectionSort(int[] array) {
	        int n = array.length;
	        
	        for (int i = 0; i < n - 1; i++) {
	            int minIndex = i;
	            
	            for (int j = i + 1; j < n; j++) {
	                if (array[j] < array[minIndex]) {
	                    minIndex = j;
	                }
	            }
	            
	            if (minIndex != i) {
	                // Swapping elements
	                int temp = array[i];
	                array[i] = array[minIndex];
	                array[minIndex] = temp;
	            }
	        }
	    }
	    
	    public static void printArray(int[] array) {
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	}


