import java.util.Scanner;
public class Multadd {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a, b, c;
double n, m, k, d;		
double x;

System.out.println("What is your a value? ");
a = in.nextInt();
System.out.println("What is your b value? ");
b = in.nextInt();System.out.println("What is your c value? ");
c = in.nextInt();
System.out.println("What is your x value? ");
x = in.nextInt();

	d= multadd(a,b,c);
	System.out.println("print "+d);
	k=multadd(0.5, Math.cos(Math.PI/4),Math.sin(Math.PI/4));
	System.out.println("print2 "+k);
	m=expSum(x, 1/(Math.exp(x)), Math.sqrt(1-Math.exp(-x)));
	System.out.print("print3 "+m);
	}
public static double multadd(double a, double b, double c) {
	double x;
	x= a * b + c;
	return x;
}
public static double expSum(double a, double b, double c) {
	double x;
	x=multadd(a,b,c);
	return x;
}
}
