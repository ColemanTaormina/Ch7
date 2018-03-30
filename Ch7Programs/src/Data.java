
public class Data {
	private double[] values;
	private double valuesSize;
	

	public static void main(String[] args) {
		double [] values= {4.8, 5.3, 6.8, 6.0, 7.3, 7.9, 8.2, 8.0, 8.5, 9.8, 9.9, 9.3, 11.0};
		
		System.out.print("The original array is: ");
			for ( int i = 0; i< values.length;  i++){
				System.out.print(values[i]+ ", ");
			}
		
			smooth(values);
				}
	
	
	public static void smooth(double[] values ){
	System.out.println();
	System.out.print("The smoothed array is: ");
//System.out.print(getValues());
System.out.print((values[0] + values[1])/2 + ", ");
for (int i = 1; i<values.length-1; i++){
	double b = (values[i-1] + values[i]+  values[i+1])/3;
	System.out.printf("%4.2f , ", b);
}

System.out.print((values[values.length-1] + values[values.length-2])/2);

	}	
}

