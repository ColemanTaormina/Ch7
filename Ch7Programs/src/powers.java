import java.util.Scanner;
public class powers {
	public static void main(String[] args) {
		int n;
		System.out.print("What is your n value for powers 0-20? ");
		Scanner in1= new Scanner(System.in);
		n= in1.nextInt();
		findDanPowers(n);
	}
	
	public static void findDanPowers(int n) {
	int y =0;
	long z=n;
	int counter=0;
	while(counter<=20) {
	if (counter>=1) {
		z*=n;
	}
	else if(counter==0) { 
	z=1;
	}
	counter++;
	System.out.printf("\n%d",z);
	
	}
	
	}
	
}
