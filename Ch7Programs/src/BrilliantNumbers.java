import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class BrilliantNumbers {
	public static void main(String[] args) throws IOException{
		Scanner infile = new Scanner (new File("data.txt"));
while (infile.hasNext()) {
		int x=infile.nextInt();
		System.out.println(x);
		if (x%2==0) {
			System.out.println("This is not a Brilliant Number since it is an even number unless it is: 4,6,10,14 the acceptions to the even rule (I'll check)");
		}if (x%2!=0) {
			System.out.println("This could be a BN lets continue...");
	}
		
		int y=2;
		int z=2;
	while(y<10){
		if (x==4 ||x==6||x==10||x==14) {
			y=x/2;
			System.out.println("This is a Brilliant Number since it is an acception to the even rule  2, "+y);
			break;
		}
		
		if ((y%2)!=0){
			z=(x/y);
			}
		if ((y%2)!=0 && (z%2)!=0 &&(z*y)==x&&(z!=1)&&(z<10)){
			System.out.println("This is a Brilliant Number1  "+y+","+z);
			break;
		
			
		
}
		y++;
	}int a=10;
while(a<=99){
		
		if ((a%2)!=0){
			z=(x/a);
			}
		if ((a%2)!=0 && (z%2)!=0 &&(z*a)==x&&(z!=1)&&(z<99)&&(z>=10)){
			System.out.println("This is a Brilliant Number2  "+a+","+z);
			break;
		
			
		
}
		a++;
	}
int b=100;
while(b<=999){
		
		if ((b%2)!=0){
			z=(x/b);
			}
		if ((b%2)!=0 && (z%2)!=0 &&(z*b)==x&&(z!=1)&&(z<999)){
			System.out.println("This is a Brilliant Number3  "+b+","+z);
			break;
		
		
			
		
}
		b++;
	}
}

	}
}

