public class Montyhall {
	public static void samedoor(int a) {
	
		int win=0;
		int	loses=0;
		int count=0;
	
		while(count<1000){
		 a = (int)(Math.random()*3+1);
		 int b = (int)(Math.random()*3+1);
			if (a==b){
			win=win+1;
		}	else if(a!=b){
			loses=loses+1;
		}		
		count++;
		}
		System.out.print("You won(same door) "+ win +" You Lost(same door) "+ loses);
	}
	public static void movingdoor(int a) {
		int win=0;
		int	loses=0;
		int count=0;
		
	while(count<1000){
		
		 int b = (int)(Math.random()*3+1);
			if (a!=b){
			win=win+1;
		}	else if(a==b){
			loses=loses+1;
		}a = (int)(Math.random()*3+1);
	count++;
	
	
}
	System.out.println("You won(moving door) "+ win +" You Lost(moving door) "+ loses);
	}
	public static void main(String[]args){
	movingdoor(1);
	samedoor(1);
	
	
	
	
	
	}
	}
