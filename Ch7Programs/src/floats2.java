import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class floats2 {
	public static void main(String[] args) throws IOException {
		Scanner inFile = new Scanner(new File("testdata.txt"));
		double number;

		double total = 0;
		int counter = 0;
		double max= Integer.MIN_VALUE;
		double min= Integer.MAX_VALUE;
		
		while (inFile.hasNext()) {
			number = inFile.nextDouble();
			//System.out.print(number + "    ");
			total = number + total;
			counter++;
		
		
		if (number>max) {
					max=number;
				}
		if (number< min) {
		min=number;
		}
		}
		System.out.print("Mean = ");
		System.out.printf("%.3f",total/counter);
		System.out.println("\nMinimum = "+ min);
		System.out.println("Maximum = "+ max);
System.out.printf("Range = %.3f", +(max - min));
		
	}
}

