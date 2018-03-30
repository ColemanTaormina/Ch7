import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Failedtests {
	public static void main(String[] args) throws IOException {
		Scanner infile = new Scanner(new File("data.txt"));
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		int f=0;
		while (infile.hasNext()) {
			double x = infile.nextDouble();
			
			
			if(x>=90) {
				System.out.println("A");
				a= a+1;
			}
			if ((x<=89.99) && (x>=80)) {
				System.out.println("B");
				b=b+1;
			}
			if ((x<=79.99) && (x>=70)) {
				System.out.println("C");
				c=c+1;
			}
			if ((x<=69.99) && (x>=60)) {
				System.out.println("D");
				d=d+1;
			}
			if (x<60) {
				System.out.println("F");
				f=f+1;
			}
		}
		System.out.println("So in conclusion you got, A: "+a+" B: "+b+" C: "+c+" D: "+d+" F: "+f);
		
	}
}
