//Coleman Taormina
//Scrabble
//12/15/17

//lets me put in values later
import java.util.Scanner;
public class Scrabblepartner {
	
	static boolean playerXTurn = true;
	//global variables for making sure that the values work to allow the code to progress
		//will explain more later in method 
	static Scanner in = new Scanner(System.in);
	//allows me to input values
	public static void main(String[] args) {

	Scrabble one =new Scrabble();
//allows me to call the other class methods	
	one.printBoard();	
	//prints the array
	
	
		//determines values for the letter and the location on the board
			System.out.print("What letter do you want first?");
			int a=0;
			int b=0;
			int c=0;
			int d=0;
			int x=0;
			int z=0;
			int y=0;
			int A=0;
			int B=0;
			int C=0;
			int D=0;
		int triangle=0;
		//global variable for making sure it goes/stops
			while (playerXTurn) {
				
				System.out.println("A,E,D,R,B,M,V,Y,J,X are the choices for your word");
						System.out.println( " 1=A 2=E and so on,chose four letters");
						
// the player chooses a number that is a representation of a letter 
						// the letter has to be 1-10  for one of the ten letters
			while ((a<=0)||(a>=11)){
				if ((triangle>0)&&(playerXTurn)) {
				System.out.println("the first value is not one of the numbers with a letter value try agian");
				}
				//gets a value rep. of the letter
				a = in.nextInt();
				//if the number is 1-10 it sets another variable representing the letters actual
				//point values to a variable (this is done 4 times for each user input for a letter
				if (a==1) {
					A=1;
					playerXTurn=false;	
				}
				if (a==2) {
					A=1;
					playerXTurn=false;	
				}
				if (a==3) {
					A=2;
					playerXTurn=false;	
				}if (a==4) {
					A=2;
					playerXTurn=false;	
				}if (a==5) {
					A=3;
					playerXTurn=false;	
				}if (a==6) {
					A=3;
					playerXTurn=false;	
				}if (a==7) {
					A=4;
					playerXTurn=false;	
				}if (a==8) {
					A=4;
				}if (a==9) {
					A=8;
					playerXTurn=false;	
				}if (a==10) {
					A=8;
					playerXTurn=false;	
				}
				triangle++;
			}
			//reuse counter
			triangle=0;
			playerXTurn=true;
			System.out.println("next number");
			
			while ((b<=0)||(b>=11)&&(playerXTurn)){
				if ((triangle>0)&&(playerXTurn)) {
					System.out.println("the second value is not one of the numbers with a letter value try agian");
				}
				//gets a value rep. of the letter
					b = in.nextInt();
					//if the number is 1-10 it sets another variable representing the letters actual
					//point values to a variable (this is done 4 times for each user input for a letter
					if (b==1) {
						B=1;
						playerXTurn=false;	
					}
					if (b==2) {
						B=1;
						playerXTurn=false;	
					}
					if (b==3) {
						B=2;
						playerXTurn=false;	
					}if (b==4) {
						B=2;
						playerXTurn=false;	
					}if (b==5) {
						B=3;
						playerXTurn=false;	
					}if (b==6) {
						B=3;
						playerXTurn=false;	
					}if (b==7) {
						B=4;
						playerXTurn=false;	
					}if (b==8) {
						B=4;
						playerXTurn=false;	
					}if (b==9) {
						B=8;
						playerXTurn=false;	
					}if (b==10) {
						B=8;
						playerXTurn=false;	
					}
					triangle=triangle+1;
				} 
			playerXTurn=true;
			triangle=0;
			//reuse counter
			System.out.println("next number");
			while ((c<=0)||(c>=11)&&(playerXTurn)){
				if ((triangle>0)&&(playerXTurn)) {
					System.out.println("the third value is not one of the numbers with a letter value try agian");
				}
				//gets a value rep. of the letter
						c = in.nextInt();
						//if the number is 1-10 it sets another variable representing the letters actual
						//point values to a variable (this is done 4 times for each user input for a letter
						if (c==1) {
							C=1;
							playerXTurn=false;	
						}
						if (c==2) {
							C=1;
							playerXTurn=false;	
						}
						if (c==3) {
							C=2;
							playerXTurn=false;	
						}if (c==4) {
							C=2;
							playerXTurn=false;	
						}if (c==5) {
							C=3;
							playerXTurn=false;	
						}if (c==6) {
							C=3;
							playerXTurn=false;	
						}if (c==7) {
							C=4;
							playerXTurn=false;	
						}if (c==8) {
							C=4;
							playerXTurn=false;	
						}if (c==9) {
							C=8;
							playerXTurn=false;	
						}if (c==10) {
							C=8;
							playerXTurn=false;	
						}
						triangle=triangle+1;
				}
			triangle=0;
			//reuse counter
			playerXTurn=true;
			System.out.println("next number");
			while ((d<=0)||(d>=11)&&(playerXTurn)){
				if ((triangle>0)&&(playerXTurn)) {
					System.out.println("the fourth value is not one of the numbers with a letter value try agian");
				}
				//gets a value rep. of the letter
							d = in.nextInt();
							//if the number is 1-10 it sets another variable representing the letters actual
							//point values to a variable (this is done 4 times for each user input for a letter
							if (d==1) {
								D=1;
								playerXTurn=false;	
							}
							if (d==2) {
								D=1;
								playerXTurn=false;	
							}
							if (d==3) {
								D=2;
								playerXTurn=false;	
							}if (d==4) {
								D=2;
								playerXTurn=false;	
							}if (d==5) {
								D=3;
								playerXTurn=false;	
							}if (d==6) {
								D=3;
								playerXTurn=false;	
							}if (d==7) {
								D=4;
								playerXTurn=false;	
							}if (d==8) {
								D=4;
								playerXTurn=false;	
							}if (d==9) {
								D=8;
								playerXTurn=false;	
							}if (d==10) {
								D=8;
								playerXTurn=false;	
							}
							triangle=triangle+1;
						}
		//sends the letter values to score
			one.score(A,B,C,D);
			//sends the chosen input to makeEasier for the word produced 
			one.makeEasier(a);
			one.makeEasier(b);
			one.makeEasier(c);
			one.makeEasier(d);
			
			playerXTurn=false;	
			//ends turn
			}
		}
	
	}

