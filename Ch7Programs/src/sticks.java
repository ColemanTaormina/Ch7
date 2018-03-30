import java.util.Scanner;
public class sticks {
	public static void main(String[] args) {
//If any of the three lengths is greater than the sum of the other two,
	//you cannot form a triangle.
	//Write a method named isTriangle that takes three integers as arguments
	//and returns either true or false, depending on whether you can or cannot
	//form a triangle from sticks with the given lengths. The point of this exercise
	//is to use conditional statements to write a value method.
		Scanner in = new Scanner (System.in);
		int a;
		int b;
		int c;
		System.out.println("What is the value of stick a? ");
		a=in.nextInt();
		System.out.println("What is the value of stick c? ");
		b=in.nextInt();
		System.out.println("What is the value of stick c? ");
		c=in.nextInt();
		if (a<=0||b<=0||c<=0) {
		System.err.print("No");
	}else {
		isTriangle(a,b,c);
	}
}
	public static boolean isTriangle(int a, int b, int c) {
		boolean x;
		

	
	if (a+b>c&& a+c>b&& b+c>a) {
		x=true;
		System.out.print(" the sticks form a Triangle");
		return x;
	}else {  
		x=false;
	System.out.print(" the sticks do not form a Triangle");
return x;
	}	
}
}