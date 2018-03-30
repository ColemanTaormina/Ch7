import java.util.Scanner;
public class SquarRoot {
	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	double input;
	double x0;
	double x1=0;
	while(1>0){
//	System.out.println("What values to find the square root of a value at an initial value at xv0, in the terms of this equation, xv1=(xv0+(a/xvo))/2 would you like to find");
	System.out.println("What is the value of a? ");
	input=in.nextInt();
	x0=input/2;
	while(Math.abs(x0-x1)>0.0001){
System.out.printf("%f\t%f\n",x0,x1);
	
	x1= ((x0+(input/x0))/2.0);
	x0= ((x1+(input/x1))/2.0);
	System.out.printf("Guess:%f\n",x1);
	}
	System.out.printf("Round Guess: %f\n\n",x1);
	}
	
}
}
