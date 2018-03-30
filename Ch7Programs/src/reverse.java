public class reverse {
	public static void main(String[] args) {
		int[] index= {1,4,9,16,9,7,4,9,11};
		int g = index.length;
		System.out.println("initial array");
		for (int i = 0; i<index.length; i = i+1){
			System.out.print(index[i]+ ", ");
		}
		System.out.println();
		System.out.println("new array");
		for (int i= 0; i<index.length/2; i=i+1){
			
			g= index[i];
			
			index[i] = index[index.length-i-1];
			index[index.length-i-1]=g;
		}
		System.out.println();
		for (int i = 0; i<index.length; i = i+1){
			System.out.print(index[i]+ ", ");
		}
	
	}
}

