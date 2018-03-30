
public class tenIntegers {
	public static void main(String[] args) {
		int[] index= {1,4,7,2,5,1,3,9,7,3};
		int max=0;
		int c=0;
		for(int i=0; i<index.length;i++) {
			max=index[i];
			System.out.print(max+" ");
		}
		System.out.println("");
		for(int i=0; i<index.length;i=i+2) {
			
			System.out.print(index[i]);
			}
		System.out.println();
		for (int i=0; i<index.length;i++) {
			if (index[i]%2==0) {
				System.out.print(index[i]);
			}
			
		}
		System.out.println();
		for (int i=index.length-1; i>=0;i=i-1) {
			
				System.out.print(index[i]);
	}
		System.out.println();
		for(int i=0; i<index.length;i++) {
			if (i==0 || i==9){
		System.out.print(index[i]);
			}
		}
		}
	
}