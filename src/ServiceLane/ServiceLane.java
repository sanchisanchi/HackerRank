package ServiceLane;

import java.util.Scanner;

public class ServiceLane {

	public static void main(String[] args) {
		int i, j; // Enter service lane at i, exit at j
		
		Scanner in = new Scanner(System.in);
		
		// Gets N, the length of the freeway
		int N = in.nextInt();
		// Gets T, the number of test cases
		int T = in.nextInt();
		
		// Array of service lane segments
		int[] segments = new int[N];
		// Populate segments array with width of each segment
		for (int x = 0; x < N; x++) {
			segments[x] = in.nextInt();
		}
		
		// For the number of test cases
		for (int y = 0; y < T; y++) {
			// Get i, start of service lane segment, and j, the exit
			i = in.nextInt();
			j = in.nextInt();
			// Find the min value of segments[] from index i to j, inclusive
			System.out.println(findMin(segments, i, j));
		}
		
		in.close();
	}
	
	public static int findMin(int[] segments, int start, int exit) {
		int min = Integer.MAX_VALUE;
		for (int i = start; i <= exit; i++) {
			if (segments[i] < min) {
				min = segments[i];
			}
		}
		return min;
	}
}