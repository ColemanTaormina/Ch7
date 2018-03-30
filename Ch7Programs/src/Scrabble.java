//Coleman Taormina
//Scrabble
//12/15/17

//lets me put in values later
import java.util.Scanner;
public class Scrabble {
	public static boolean playerXTurn = true;
	//global variables for making sure that the values work to allow the code to progress
	//will explain more later in method 
	static boolean playerXTurn2 = true;
	
	static int[] board = new int[41];
	//my array with space
	static Scanner in = new Scanner(System.in);
	//allows me to input values
	
	
		
		
		

	public static void score(int a, int b, int c, int d) {
		//score will calculate the words point value 
		
		
//sent values from main
		int z,x,y,m=0;
		int q=0;
		int r=1;
		int t=1;
		int u=1;
		int i=0;
		int g=0;
		System.out.println("choose on the board a value from 1-40 for the word to be placed");
		//user puts in the placement of the first letter and the other letters will follow suit
		q = in.nextInt();
		
		
		//if the placement of the first letter is not usable due to it going of the screen
		//or is not a number on the array it asks over and over till a number on the array
		//is called
		//user input is valid or invalid below
		while ((q<=0)||(q>=41) && (playerXTurn2 = true)&&(q!=8)&&(q!=8)&&(q!=9)&&(q!=10)&&(q!=18)&&(q!=19)&&(q!=20)&&(q!=28)&&(q!=29)&&(q!=30)&&(q!=38)&&(q!=39)&&(q!=40)){
			System.out.println("the value is not one of the numbers with a value try agian or it will go off the board");
			q = in.nextInt(); 
		}
		//if user input valid puts the value at the value where 1=1,2=2 on the array and so on 
		//each will be a spot value that will be compared with the doubling or tripling of the 
		//word or number
		z=board[q-1];
		x=board[q];
		y=board[q+1];
		m=board[q+2];
		
		// doublePoints if true will stop the loop from going to double the word if the word is tripled
		boolean doublePoints=false;
//goes five times since 5*8=40 so only needs to go 5 times through
		while(r<=5) {
			//checks if the first letter is a multiple of eight based on its location on the array
			//if so triples the word
			if ((z==(8*r)&&((r*8)!=40))) {
				a=a*3;
				b=b*3;
				c=c*3;
				d=d*3;
				doublePoints=true;
				//if true stop the double word to be accessed
			}
			//checks if the second letter is a multiple of eight based on its location on the array
			//if so triples the word
			if ((x==(8*r)&&((r*8)!=40))) {
				a=a*3;
				b=b*3;
				c=c*3;
				d=d*3;
					doublePoints=true;
					//if true stop the double word to be accessed
				}
			//checks if the third letter is a multiple of eight based on its location on the array
			//if so triples the word
			if ((y==(8*r)&&((r*8)!=40))) {
				a=a*3;
				b=b*3;
				c=c*3;
				d=d*3;
					doublePoints=true;
					//if true stop the double word to be accessed
				}
			//checks if the forth letter is a multiple of eight based on its location on the array
			//if so triples the word
			if ((m==(8*r)&&((r*8)!=40))) {
				a=a*3;
				b=b*3;
				c=c*3;
				d=d*3;
					doublePoints=true;
					//if true stop the double word to be accessed
				}	
			r++;
		}
//if non of the values were on a multiple of eight
		//goes 
		if ((r>5) && (doublePoints==false)) {
			//goes five times since 5*7=35 so only needs to go 5 times through(42>40 so does not work after)
			while ((t<=5) &&(doublePoints==false)) {
				//checks if the first letter is a multiple of seven based on its location on the array
				//if so doubles the word
				if ((z==(7*t)&&((t*7)!=35))) {
				a=a*2;
				b=b*2;
				c=c*2;
				d=d*2;
				doublePoints=true;
				//if true stop loop
			}
				//checks if the second letter is a multiple of seven based on its location on the array
				//if so doubles the word
			if ((x==(7*t)&&((t*7)!=35))) {
				a=a*2;
				b=b*2;
				c=c*2;
				d=d*2;
					doublePoints=true;
					//if true stop loop
				}
			//checks if the third letter is a multiple of seven based on its location on the array
			//if so doubles the word
			if ((y==(7*t)&&((t*7)!=35))) {
				a=a*2;
				b=b*2;
				c=c*2;
				d=d*2;
					doublePoints=true;
					//if true stop loop
				}
			//checks if the forth letter is a multiple of seven based on its location on the array
			//if so doubles the word
			if ((m==(7*t)&&((t*7)!=35))) {
				a=a*2;
				b=b*2;
				c=c*2;
				d=d*2;
					doublePoints=true;
					//if true stop loop
				}
			t++;
			}
		}
		//reused doublePoints since can work weather or not the word is tripled or doubled
		// can have only one multiple of five based on coordinates so will stop the loop if a 5x is hit
			doublePoints=false;
		if( (doublePoints==false)) {
		while((u<=8) &&(doublePoints==false)) {
			//checks if the first letter is a multiple of five based on its location on the array
			//if so triples the letter
			if ((z==(5*u))&&((u*5)!=15)) {
				a=a*3;
				doublePoints=true;
				//if true stop loop
			}
			//checks if the second letter is a multiple of five based on its location on the array
			//if so triples the letter
			if ((x==(5*u)&&((u*5)!=15))) {
					b=b*3;
					doublePoints=true;
					//if true stop loop
				}
			//checks if the third letter is a multiple of five based on its location on the array
			//if so triples the letter
			if ((y==(5*u)&&((u*5)!=15))) {
					c=c*3;
					doublePoints=true;
					//if true stop loop
				}
			//checks if the forth letter is a multiple of five based on its location on the array
			//if so triples the letter
			if ((m==(5*u)&&((u*5)!=15))) {
					d=d*3;
					doublePoints=true;
					//if true stop loop
				}
			u++;
			}
		}
		//reused doublePoints since can work weather or not the word is tripled or doubled or a letter is doubled
		doublePoints=false;
		while((g<=6) &&(doublePoints==false)) {
			if ((z==(i))) {
				a=a*2;
				doublePoints=true;
				//if true stop loop
			}
			if ((x==(i))) {
					b=b*2;
					doublePoints=true;
					//if true stop loop
				}
			if ((y==(i))) {
					c=c*2;
					doublePoints=true;
					//if true stop loop
				}
			if ((m==(i))) {
					d=d*2;
					doublePoints=true;
					//if true stop loop
				}
			i=(6*g)+3;
			g=g+1;
			//gets all values of every other multiple of three and counters up for the loop
		}		
		System.out.println("Square"+q+": "+(a+b+c+d)+" points");
		//what value the word produced
		playerXTurn2=false;	
		//stops loop
		
	}
	
	public static void makeEasier(int a) {
		//letst the user see the word
		
		
		//sent values by main as a simplifier
		//makes the inputed values letters for the user to see
		String i="";
		if (a==1) {
			i="A";
		}else if(a==2) {
			i="E";
		}else if(a==3) {
			i="D";
		}else if(a==4) {
			i="R";
		}else if(a==5) {
			i="B";
		}else if(a==6) {
			i="M";
		}else if(a==7) {
			i="V";
		}else if(a==8) {
			i="Y";
		}else if(a==9) {
			i="J";
		}else if(a==10) {
			i="X";
		}
			System.out.print(i+"");
	//now the word can be seen
		
	}
	
	public static void printBoard() {
		//makes array with values
		
		//makes grid with elements have a integer value of 1 greater than its element
		for (int k = 0; k < board.length; k++) {
			board[k] = k+1;	
					}
		int x=1;
		int y=1;
		//puts in spaces for a nicer looking board and makes it a 4X10 board
		for (int j = 0; j < board.length-1; j++) {
			System.out.print(board[j] + " ");
			if ((y<10)) {
				System.out.print(" ");
				//space for 1-10 as to make it line up with bottom numbers with two digits 
			}
			if ((x==10)) {
				System.out.println();
				//for ever ten numbers a new line is made
				x=0;
				} 
			x=x+1;
			y=y+1;
		}
		System.out.println("");
	}	
}
