import java.util.Scanner;
public class correctAnswers {
	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
		int r;
		int c;
		System.out.print("Give rows ");
		r=in.nextInt();
		System.out.print("Give columns ");
		c=in.nextInt();
		int[][] arr= new int [r][c];
		
		
		
	for(int y=0; y<r; y++) {
		for(int j = 0; j<c;j++) {
			arr[y][j]= (int) (Math.random()*11);
		}
	}
	for(int y = 0; y<r; y++) {
		for(int j=0; j<c;j++) {
			System.out.print(arr[y][j]+"\t");
		}
		System.out.println();
	}
	}
}
