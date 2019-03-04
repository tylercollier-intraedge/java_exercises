/**
 * Write a program to find the sum of values in an integer array
 */
public class ArraySum {
	public static void main(String[] args) {
    	int[] a = { 1, 2, 33 };
    	int sum = 0;
    	for (int i = 0; i < a.length; i++) {
    		sum += a[i];
    	}
    	System.out.println("Sum " + sum);
	}
}