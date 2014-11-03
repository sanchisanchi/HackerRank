package TheLoveLetterMystery;

import java.util.Scanner;

public class TheLoveLetterMystery {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Number of test cases
		int _t = in.nextInt();
		String word;
		
		for (int i = 0; i < _t; i++) {
			// Get word in next line
			word = in.next();
			System.out.println(numOperations(word));
		}
		in.close();

	}
	
	public static int numOperations(String s) {
		int count = 0;
		int operations;
		// Convert input word to array of letters
		char letters[] = s.toCharArray();
		int j = letters.length - 1;
		
		// For half the length of the word
		for (int i = 0; i < (int)(letters.length / 2); i++) {
			// If letters on corresponding ends of word don't math
			if (letters[i] != letters[j]) {
				// Number of operations = absolute value of subtracting numerical values of letters
				operations = Math.abs(letters[i] - letters[j]);
				count += operations;
			}
			j--;
		}
		return count;
	}

}
