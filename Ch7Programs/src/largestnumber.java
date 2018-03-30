import java.util.Scanner;
public class largestnumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a, b, c, d, e, f, g, h, i, j, k, l, m, n;
		double x;

		System.out.println("What is your a value? ");
		a = in.nextInt();
		System.out.println("What is your b value? ");
		b = in.nextInt();
		System.out.println("What is your c value? ");
		c = in.nextDouble();	
		System.out.println("What is your d value? ");
		d = in.nextDouble();	
		System.out.println("What is your e value? ");
		e = in.nextInt();
		System.out.println("What is your f value? ");
		f = in.nextInt();
		System.out.println("What is your g value? ");
		g = in.nextInt();
		System.out.println("What is your h value? ");
		h = in.nextDouble();
		System.out.println("What is your i value? ");
		i = in.nextDouble();
		System.out.println("What is your j value? ");
		j = in.nextDouble();
		k=findLargest(a,b);
		l=findLargest(c,d);
		m=findLargest(e,f,g);
		n=findLargest(h,i,j);
		System.out.println("Method 1: "+k+" is the larger value");
		System.out.println("Method 2: "+l+" is the larger value");
		System.out.println("Method 3: "+m+" is the largest value");
		System.out.println("Method 4: "+n+" is the largest value");
	}
	public static int findLargest(int a, int b) {
int x=0;
		if (a>b) {	
	x=a;
}else {
	x=b;
}
		
		return x;
	}
	public static double findLargest(double c, double d) {
		double x=0;
		if (c>d) {	
	x=c;
}else {
	x=d;
}
		
		return x;
	}
	public static int findLargest(int e,int f,int g) {
		int x=0;	
			if (e>f && e>g) {
				x=e;
			}else if(f>e && f>g) {
				x=f;
			}else {
				x=g;
			}
			return x;
		}
	public static double findLargest(double h,double i, double j) {
			double x=0;
			if (h>i && h>j) {
				x=h;
			}else if(i>h && i>j) {
				x=i;
			}else {
				x=j;
			}
				return x;
			}
}