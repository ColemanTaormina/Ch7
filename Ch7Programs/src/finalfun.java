
public class finalfun {
	public static void main(String[] args) {
int [] values= {1,5,5,4,3,1,2,2,2,2,6,1,3,3,5,5,5,5};
	
int max=0;
	int index=0;
	for( int r=0; r<values.length; r++) {
		int counter=0;
	
		
	
	for( int c = r+1; c<values.length; c++) {
	if (values[c]!=values[r]) {
		break;
	}
	else {
		counter++;
	}
	}
	if (counter>max) {
		max=counter;
	}
	if (max==counter) {
		index=r;
	}
	
	if (max>1) {
		System.out.print(r); 
		}
	else {
		System.out.print("-1"); 
	}
	}
}
}
