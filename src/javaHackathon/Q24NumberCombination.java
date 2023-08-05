package javaHackathon;
import java.util.Scanner;

public class Q24NumberCombination
{
	
	    public static void printConsecutiveCombinations(int N) {
	        int start = 1;
	        int end = (N + 1) / 2;
	        int sum = start;

	        while (start <= end) {
	            if (sum == N) {
	                printCombination(start, end);
	                sum -= start;
	                start++;
	            } else if (sum > N) {
	                sum -= start;
	                start++;
	            } else {
	                end++;
	                sum += end;
	            }
	        }
	    }

	    public static void printCombination(int start, int end) {
	        for (int i = start; i <= end; i++) {
	            System.out.print(i);
	            if (i < end) {
	                System.out.print(" + ");
	            }
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a positive natural number: ");
	        int N = scanner.nextInt();
	        scanner.close();

	        System.out.println("Possible consecutive number combinations:");
	        printConsecutiveCombinations(N);
	    }
	}


