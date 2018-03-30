import java.util.Scanner;
public class findsum {
	public static void main(String[] args) {
	
		findSum(1,2);
		newLine();
		findSum(1,3);
		newLine();
		findSum(2,4);
		newLine();
		findSum(3,5);
		newLine();
		findSum(7,4);
		newLine();
		findSum(9,9);
		newLine();
		
}
	public static void findSum(int a, int b) {	
		System.out.printf("%d plus %d equals %d", a,b,a+b);
}
	public static void newLine() {
		System.out.println("\n");
	}

	
	
	
	
	
	}
