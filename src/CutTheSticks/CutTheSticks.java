package CutTheSticks;

import java.util.Arrays;
import java.util.Scanner;

public class CutTheSticks {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] lengths = new int[N];
		int min, count;
		
		// Populate array of stick lengths
		for (int i = 0; i < N; i++) {
			lengths[i] = in.nextInt();
		}
		in.close();
		
		for (int i = 0; i < N; i++) {
			min = min(lengths);
			count = cutCount(lengths, min);
			if (count == 0)
				break;
			System.out.println(count);
		}
	}
	
	public static int cutCount(int[] lengths, int min) {
		int count = 0;
		for (int i = 0; i < lengths.length; i++) {
			if (lengths[i] != 0) {
				lengths[i] -= min;
				count++;
			}
		}
		return count;
	}
	
	public static int min(int[] lengths) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < lengths.length; i++) {
			if (lengths[i] == 0) {
				continue;
			}
			if (lengths[i] < min) {
				min = lengths[i];
			}
		}
		return min;
	}

}
