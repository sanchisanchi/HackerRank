package UtopianTree;

import java.util.Scanner;

public class UtopianTree {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Get number of text cases
		int T = in.nextInt();
		
		for (int i = 0; i < T; i++) {
			// Get number of cycles
			int N = in.nextInt();
			System.out.println(grow(N));
		}
		
		in.close();

	}
	
	public static int grow(int N) {
		// Height of tree when planted
		int height = 1;
		
		// If no cycles
		if (N == 0) {
			return 1;
		}
		
		// For number of cycles
		for (int i = 1; i <= N; i++) {
			// Odd cycle number = Spring, height doubles
			if (i % 2 == 0) {
				height += 1;
			}
			// Even cycle number = Summer, height + 1
			else {
				height *= 2;
			}
		}
		return height;
	}

}
