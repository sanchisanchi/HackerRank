package HalloweenParty;

import java.util.Scanner;

public class HalloweenParty {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int k;
		
		for (int i = 0; i < t; i++) {
			k = in.nextInt();
			System.out.println(numPieces(k));
		}
		in.close();
	}
	
	public static long numPieces(int k) {
		long xCut, yCut;
		xCut = (long) k / 2;
		yCut = k - xCut;
		return xCut * yCut;
	}

}
