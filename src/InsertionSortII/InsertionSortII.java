package InsertionSortII;

import java.util.Scanner;

public class InsertionSortII {

	public static void insertionSortPart2(int[] ar) {       
        int temp, j;   
		for (int i = 1; i < ar.length; i++) {
			if (ar[i] < ar[i-1]) {
				j = i;
				while (j > 0 && ar[j] < ar[j-1]) {
					temp = ar[j-1];
					ar[j-1] = ar[j];
					ar[j] = temp;
					j--;
				}
			}
			printArray(ar);
		}
    }  
      
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n + " ");
      }
        System.out.println("");
   }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i = 0; i < s; i++) {
             ar[i] = in.nextInt(); 
        }
        in.close();
        insertionSortPart2(ar);    
                     
     }  

}
