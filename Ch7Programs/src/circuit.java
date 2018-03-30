import java.io.File;
import java.util.Scanner;
import java.io.IOException;
public class circuit {
	public static void main(String[] args)throws IOException {
		
		double x = 0;
		
	calculations(x);
		
		
	}
	
		public static double calculations(double x)throws IOException{
			Scanner inFile = new Scanner(new File("testdata.txt"));
			
			double totalResistance;
			double resistance1, resistance2, resistance3;
		
	
			while(inFile.hasNext()) {
				double counter = 0;	
			
				
			resistance1 = inFile.nextDouble();
			resistance2 = inFile.nextDouble();
			resistance3 = inFile.nextDouble();
			
			totalResistance = (((resistance1*resistance2) / (resistance1 + resistance2)) + resistance3);
			System.out.printf("Total resistance is %.4f \n", totalResistance);
			
		
			}
	
			return x;
}
}
