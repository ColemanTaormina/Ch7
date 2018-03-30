import java.util.Scanner;
public class Easter {
	public static void main(String[] args) {
	Scanner in= new Scanner (System.in);
	int a, b, c, d, e, f, g, h, j, k, m, r, n, p;
	int y;
	
	
	System.out.print("What is the year? ");
	y=in.nextInt();
			
	a=y%19;
	b=y/100;
	c=y%100;
	d=b/4;
	e=b%4;
	g=(8*b+13)/25;
	h=(19*a+b-d-g+15)%30;
	j=c/4;
	k=c%4;
	m=(11*h+a)/319;
	r=(2*e+2*j-k-h+m+32)%7;
	n=(h-m+r+90)/25;
	p=(h-m+r+n+19)%32;
	
	System.out.println("a="+a+"\th="+h+"\tn="+n);
	System.out.println("b="+b+", c="+c+"\tj="+j+", k="+k+"\tp="+p);
	System.out.println("g="+g+"\tr="+r);
	
	String month=month(n);
	System.out.println("So, in "+y+", Easter fell on the "+p+"(^nd or^th) day of the "+n+"(^nd or^th) month, or "+month);
	System.out.print(month+" "+p+", "+y);
	}
	
	public static String month(int month ) {
	String a= Integer.toString(month);
	if (a.equals("1")){
		a="January";
	}
		else if (a.equals("2")){
			a="Febuary";
		}
		else if (a.equals("3")){
			a="March";
		}
		else if (a.equals("4")){
			a="April";
		}
		else if (a.equals("5")){
			a="May";
		}
		else if (a.equals("6")){
			a="June";
		}
		else if (a.equals("7")){
			a="July";
		}
		else if (a.equals("8")){
			a="August";
		}
		else if (a.equals("9")){
			a="September";
		}
		else if (a.equals("10")){
			a="October";
		}
		else if (a.equals("11")){
			a="November";
		}
		else if (a.equals("12")){
			a="December";							
		}							
		return a;								
}
}
