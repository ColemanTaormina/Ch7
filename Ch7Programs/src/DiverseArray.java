import java.lang.reflect.Array;

public class DiverseArray {
 
   	public static void main(String[] args) {
 
          	int[][] mat1 = { { 1, 3, 2, 7, 3 }, { 10, 10, 4, 6, 2 }, { 5, 3, 5, 9, 6 }, { 7, 6, 4, 2, 1 } };
 
          	int[][] mat2 = { { 1, 1, 5, 3, 4 }, { 12, 7, 6, 1, 9 }, { 8, 11, 10, 2, 5 }, { 3, 2, 3, 0, 6 } };
 
          	int[] arr1 = { 1, 3, 2, 7, 3 };
          	int[] rowSum1 = new int[4];
          	int[] rowSum2 = new int[4];
 
          	// ------------- Check for part a ---------------------
          	System.out.println("The sum of the array is " + arraySum(arr1));
          	// output above should be The sum of the array is 16
 
          	// ------------- Check for part b ---------------------------
 
          	rowSum1 = rowSums(mat1);
          	System.out.print("The sums of mat1 are:  ");
          	for (int i : rowSum1) {
                 	System.out.print(i + "  ");
          	}
          	// output should be 16 32 28 20
          	System.out.println();
 
          	rowSum2 = rowSums(mat2);
          	System.out.print("The sums of mat2 are:  ");
          	for (int i : rowSum2) {
                 	System.out.print(i + "  ");
          	}
          	// output should be 14 35 36 14
          	System.out.println();
 
          	// -------------------- Check for part c -----------
 
          	System.out.println(isDiverse(mat1));
          	// output should be true
 
          	System.out.println(isDiverse(mat2));
          	// output should be false
 
   	}
 
   	// -------- PART A -------------------------
   	// Returns the sum of the entries in the one-dimensional array arr
   	public static int arraySum(int[] arr) {
          	// your code for part A goes here
   		int sum=0;
 for (int i=0; i<arr.length; i++){
	  sum= sum+ arr[i];
 }
 return sum;
   	}
 
   	
// ----------- PART B -----------------------
   	// Returns a one-dim array in which the entry at index k is the sum
   	// of the entries of row k of the two-dimensional array arr2D
 
   	public static int[] rowSums(int[][] arr2D) {
          	// your code for part B goes here

	int c=0;
	int [] k = new int[arr2D.length];
          	for (c=0; c<arr2D.length; c++) {
          		
          k[c]=arraySum(arr2D[c]);
          	}
          	
          	return k;
   	}
 
   	// ---------- PART C ------------------------------
   	// Returns true if all rows in arr2D have different row sums
   	// false otherwise
 
   	public static boolean isDiverse(int[][] arr2D) {
          	// your code for part c goes here
   		int z[] = rowSums(arr2D);
 for (int q=0; q<z.length; q++) {
	 for (int b=q+1; b<z.length;b++){
		 if (z[q]==z[b]) {
	return false;
 }
 }
 } 
 return true;    	
}
}
