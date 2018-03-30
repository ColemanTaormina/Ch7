import java.util.Scanner;
public class sixpttwo {
public static void main(String[] args) {
	//Exercise 6.2 Write a method named isDivisible that takes two integers,
	//n and m, and that returns true if n is divisible by m, and false otherwise.
	Scanner in = new Scanner (System.in);
	int n;
	int m;
	
	System.out.println("What is the value of n? ");
	n=in.nextInt();
	System.out.println("What is the value of m? ");
	m=in.nextInt();
	if (m==0) {
		System.err.print("Does not work");
	}
	else if (isDivisible(n,m));
}
public static boolean isDivisible(int n, int m) {
	boolean x=false;

	
	if (n%m==0 && m!=0){
		x=true;
		System.out.print("n is evenly divisible by m");

	}else if(m!=0) {
		x=false;
		System.out.print("n is not evenly divisible by m");

	}
	
	//else if (m==0) {
	//System.err.print("Does not compute");
	//x=false;

	//}
	return x;

	}
}

