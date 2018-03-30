import java.util.Scanner;
public class printBinary {
	public static void main(String[] args) {
		int input;
		System.out.print("Put a number: ");
		Scanner in1= new Scanner(System.in);
		input= in1.nextInt();
		
	printBinary(input);
	printHex(input);
	}
	public static void printBinary(int input) {
	
			int b;
		int c= input;
		
		String s="";
		

		
while (input/2.0 >0){
			b= (int)input%2;
		input=input/2;
		s =Integer.toString(b)+s;
		}
	
System.out.println("Binary:"+s);
}
	public static void printHex(int input) {
		String Hex="";
		int b;
		int c= input;
		String s="";
			
		while(input>0){
			if( input%16>9){
			if (input%16==10)
			Hex="A";
			if(input%16==11)
			Hex="B";
			if (input%16==12)
			Hex="C";
			if (input%16==13)
			Hex="D";
			if (input%16==14)
			Hex="E";
			if (input%16==15)
			Hex="F";
			}
		else if (input%16<=9){
			Hex=Integer.toString(input%16);
		}
		s=Hex+s;
				input=input/16;
	}
			System.out.println("Hexadecimal:"+s);
	}
	

}
