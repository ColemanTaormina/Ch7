import java.util.Scanner;
public class craps {
	public static void main(String[] args) {
	Scanner in= new Scanner (System.in);
	int dice=(int) (Math.random()*6)+1;
	int dice2=(int)(Math.random()*6)+1;
	int total;
	int total2=0;
	int first;
	String enter;
	
	System.out.println("Let's play Craps! Roll the dice by pressing enter");
	Scanner in1= new Scanner(System.in);
	enter= in1.nextLine();
	total=dice+dice2;
	first=total;
	System.out.println("Die1="+ dice);
	System.out.println("Die2="+ dice2);
	
	
if ((total==7) || (total==11)) {
	System.out.println("You Win!");
}
	if ((total==2) || (total==3) || (total==12)) {
		System.out.println("You Lose");
	}
		if((total==4) || (total==5)||(total==6) || (total==8) || (total==9)|| (total==10) ) {
			System.out.println("point phase");
			//System.out.println("Roll the dice again by pressing enter");
		}
	
		
	while((total2!=7) && (total2 !=first)) {
	System.out.println("Roll the dice by pressing enter");
	Scanner in2= new Scanner(System.in);
	enter= in1.nextLine();
	dice=(int) (Math.random()*6)+1;
	dice2=(int)(Math.random()*6)+1;
	total2 =dice+dice2;
	System.out.println("Die1="+ dice);
	System.out.println("Die2="+ dice2);
	 
if (total2==7) {
	System.out.println("You Lose");
}
if (total2==first) {
	System.out.println("You Win!");

		
	}

}
	
	
	}
}
	
	

