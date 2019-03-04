import java.util.Scanner;
import java.util.Arrays;
/**
 * Take a single character from the alphabet as user input. Check if that
 * character is a vowel or consonant and print a suitable message. If the 
 * character is not an alphabet or a string with length greater than 1, print
 * an error message to the console.
 * HINT: use the charAt() method in the String class to find the ASCII code 
 * for a character. It should be in the range for the english alphabet (65 to 122).
 * Anything outside this range is not an alphabet.
 */
public class Alphabet {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String s = sc.next();
    	if (s.length() > 1) {
    		System.out.println("too long!");
    		System.exit(1);
    	}
    	char c = s.charAt(0);
    	int cInt = (int) c;
    	if (cInt < 65 || cInt > 122) {
    		System.out.println("Out of bounds!");
    		System.exit(2);
    	}
    	char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'y' };
    	char[] consonants = { 'b', 'c', 'd' };
    	// for (int i = 0; i < vowels.length; i++) {
    	// 	if (vowels[i] == c) {
    	// 		System.out.println("It's a vowel!");
    	// 		break;
    	// 	}
    	// }
    	for (char myChar : vowels) {
    		if (myChar == c) {
    			System.out.println("It's a vowel!");
    			break;
    		}
    		System.out.println("Got here");
    	}
    	for (int i = 0; i < consonants.length; i++) {
    		if (consonants[i] == c) {
    			System.out.println("It's a consonant!");
    			break;
    		}
    	}
    	
    	System.out.println(s);
	}
}