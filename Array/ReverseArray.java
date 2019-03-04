import java.util.Arrays;
/**
 * Write a program to reverse an array of integers
 */
public class ReverseArray {
	public static void main(String[] args) {
    	int[] a = { 1, 2, 33 };
    	int[] b = new int[a.length];
    	for (int i = 0; i < a.length; i++) {
    		b[i] = a[a.length - 1 - i];
    	}
    	System.out.println(Arrays.toString(b));
	}
}