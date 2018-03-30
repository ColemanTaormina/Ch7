
public class indexOfMax {
public static void main(String[] args) {
	int[] index= {4,6,2,9,0,2,5,3,1,5,19,8};
int max=0;
int c=0;
for(int i=0; i<index.length;i++) {
if(index[i] > max) {
	max=index[i];
c=c+1;
}
}
System.out.print(max+" is the max number and the index number "+c);
}
}