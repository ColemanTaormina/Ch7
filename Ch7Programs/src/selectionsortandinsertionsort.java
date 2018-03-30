
public class selectionsortandinsertionsort {

		
		public static void printArray2(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		}

		public static int[] selectionSort(int [] z) {
			for(int i = 0; i < z.length - 1; i++) {
				int minIndex = i;
			for(int j = i + 1; j < z.length; j++) {
				if(z[minIndex] < z[j]) {
					minIndex = j;
					printArray(z);
				}
			}
			int holder = z[minIndex];
			z[minIndex] = z[i];
			z[i] = holder;
			}
			return z;
		}







		public static void printArray(int [] arr) {
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		

	public static int [] insertionSort(int [] arr) {
	for(int i = arr.length; i < arr.length; i++) {
	int x = arr[i];
	int j = i-1;
		while(j>=0 && arr[j]>x) {
		arr[j+1] = arr[j];
	j--;
		}
			arr[j+1] = x;
				}
				return arr;
			}
		
		public static void main(String[] args) {
		int []arr = {87, 99, 58, 66, 85, 78, 85, 48, 92, 52};
		int[] z= arr;
		
		selectionSort(z);
		printArray(arr);
		//System.out.println();
		insertionSort(arr);
		printArray2(arr);
		
		

		}

		}
