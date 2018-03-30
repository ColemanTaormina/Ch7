import java.util.Arrays;

public class Multiplechoice {
	public static void main(String[] args) {
	String[][] arr= {{"A","B","A","C","C","D","E","E","A","D"},{"D","B","A","B","C","A","E","E","A","D"},{"E","D","D","A","C","B","E","E","A","D"},{"C","B","A","E","D","C","E","E","A","D"},{"A","B","D","C","C","D","E","E","A","D"},{"B","B","E","C","C","D","E","E","A","D"},{"B","B","A","C","C","D","E","E","A","D"},{"E","B","E","C","C","D","E","E","A","D"}};
	//System.out.println("The 2d array: "+Arrays.toString(arr));
	String[] key= {"D","B","D","C","C","D","A","E","A","D"};
	//System.out.println("The 1d array: "+Arrays.toString(key));
	

			for (int r=0; r<arr.length;r++){
					int yes=0;
					System.out.print("Student"+(r+1)+":");
					for (int a=0; a<10;a++){
						if (arr[r][a].equals(key[a])){
							yes++;
					}
}System.out.println(yes+" correct answers");
}
}
}
