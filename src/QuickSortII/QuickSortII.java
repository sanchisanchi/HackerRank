package QuickSortII;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuickSortII {

	static void quickSort(int[] ar) {
		int center = ar[0];
		List<Integer> smaller = new ArrayList<>();
		List<Integer> larger = new ArrayList<>();
		for (int i = 1; i < ar.length; i++) {
			if (ar[i] > center) {
				larger.add(ar[i]);
			}
			else {
				smaller.add(ar[i]);
			}
		}
		for (int i = 0; i < smaller.size(); i++) {
			ar[i] = smaller.get(i);
		}
		ar[smaller.size()] = center;
		for (int j = 0; j < larger.size(); j++) {
			ar[smaller.size() + j + 1] = larger.get(j);
		}
		printArray(ar);
	}

	static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		quickSort(ar);
	}

}
