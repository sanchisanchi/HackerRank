package GameOfThronesI;

import java.util.Arrays;
import java.util.Scanner;

public class GameOfThronesI {

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
        myScan.close();
        String ans;
		int[] letters = new int[26];
		int odd = 0;
		
		for(int i = 0; i < inputString.length(); i++){
            letters[inputString.charAt(i) - 'a']++;
        }
		
		for (int j = 0; j < letters.length; j++) {
			if (letters[j] % 2 != 0)
				odd++;
		}
		
		if (odd < 2)
			ans = "YES";
		else
			ans = "NO";

        System.out.println(ans);
	}

}
