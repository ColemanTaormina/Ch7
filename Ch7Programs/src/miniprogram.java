
import java.util.Scanner;
public class miniprogram {
	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
	int counter=0;
	int evensum=0;
	int x=1;
	int y= 0;
	int sumSquares = 0;
	int a;
	int b;
	int c;
	int sum= 0;
	int value=0;
	
	while (counter<=100) {
		if (counter%2 ==0) {
		evensum= evensum + counter;
		}
		counter++;

	
		}	
System.out.println("The sum of all even numbers between 2 and 100  = "+evensum );

do { 
	y=(int)(Math.pow(x,2));
	x++;
	sumSquares= sumSquares + y;
}
while(x<=100);
	System.out.println("The sum of squares x^2 when x<=1<=100.\nSum of all squares = "+sumSquares);
System.out.println("\nAll powers of 2^x where 0<=x<=20");
for (int count=0; count<21; count++) {
	System.out.println("x=" + count + ", 2^x" + Math.pow(2, count));
	}



System.out.print("What is the value of a? ");
a=in.nextInt();
System.out.print("What is the value of b? ");
b=in.nextInt();
c=0;
for (int i=a; i<=b; i++){  
	c= i+ c;
	
	System.out.println("The sum of all numbers between your selected a and b are= "+ c);
}
{
System.out.println("What is your value to find the sum of all odd digits of the value? Your number=");
int number=in.nextInt();	

while ((number>0)) {
value=number%10;
number= number/10;
if (value%2==1){
	sum=sum +value;
}
}
}

 System.out.println("The sum of all odd digits of your value is "+ sum);
}
}
