import java.util.Scanner;
public class Nestedloops {
	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
	int min;
	int max;
	String answer;
	String choice= "y";
	int num =1;
	while (num==1){
		System.out.print("\nWhat is your  minium value? ");
		Scanner in1= new Scanner(System.in);
		min= in1.nextInt();
		System.out.print("\nWhat is your maximum value? ");
		Scanner in2= new Scanner(System.in);
		max=in2.nextInt();
	final int a = min;
	
	if (max<=10 && min<=10){
		while (min<=max){
			System.out.print("\t"+ min++);
		}
		min=a;
			int b=min;
		
		while (min<=max){
			System.out.print("\n\n"+ min);
		for (int i=a; i<=max; i++){
			System.out.print("\t" + b*i);
		}
		min++;
		b++;
		}
	}
	else {
		System.err.print("Chose numbers less than or equal to ten.");
	}
	System.out.print("\n\nTry again? y/n: ");
	Scanner in3= new Scanner(System.in);
	answer= in3.nextLine();
	
	if (answer.equals(choice)) {
		num=1;
	}
		else{
			num=0;
		}
					
					
		}
				
		}
		}
