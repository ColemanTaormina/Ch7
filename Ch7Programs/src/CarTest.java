import java.util.Scanner;
public class CarTest {
	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
		System.out.println("The car runs as your chosen input per the amount you origainally had in the tank");
		System.out.println("Driving for your chosen miles");
		
		double a;
		double b;
		double c;
		//double d;
		System.out.print("What is the value of miles/gallon? ");
		a=in.nextDouble();
				System.out.print("What is the value of fuel in tank? ");
		b=in.nextDouble();
				System.out.print("What is the value of distance to be travled? ");
		c=in.nextDouble();
			//System.out.print("What is the value of max tank? ");
		//d=in.nextDouble();
		
		Car one= new Car(a,b,c);
		//miles per gallon, fuel in than, distance travled, max fuel	
		one.Drive();
	one.addGas();
	
	}
}
