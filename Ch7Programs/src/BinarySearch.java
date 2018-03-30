import java.util.Scanner;
public class BinarySearch {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a=0;
	int []arr = {48,52,58,66,78,85,85,87,92,99};
	System.out.println("What the value your trying to find in the array? ");
	a = in.nextInt();
	//System.out.print((int) ((1/2)*((double)(arr.length-1))));
	int b=arr.length-1;
	int e=arr.length-1;
	int min= arr.length/2;
	System.out.println("The value of min at start is " + min);
	int min2= (int) ((1/2)*((double)(arr.length)));
	int min3= (int) ((1/2)*((double)(arr.length)));
	int min4= (int) ((1/2)*((double)(arr.length)));
int c=0;
int d=0;
	while(c<100){
		
		System.out.printf("Value of a is %d and value of array at min is %d.  Min is %d \n", a, arr[min], min);
		if (a<arr[min]){
			b=b/2;
			System.out.println(b+" 1");
		}
			if(a>arr[min]){
		
				b=((min2/2)+min)/2;
			}
				if (a==arr[b]){
					System.out.println(a+" is element "+b+" of the array c1");
					break;	
				}
		
		c++;
				
	}
	while (d<100){
		if (a<arr[e]){
			e=((e+min)/2);
			System.out.println(e+" 2");
		}
			if(a>arr[e]){
		//		e=(min3/2)+min4;
			}
				if (a==arr[e]){
					System.out.println(a+" is element "+e+" of the array c2");
					break;	
				}
		
		d++;
	}
	
}
}
