package GemStones;

import java.util.Scanner;

public class GemStones {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String[] gems = new String[N];
		
		for (int i = 0; i < N; i++) {
			gems[i] = in.next();
		}
		in.close();
		
		
	}

}
