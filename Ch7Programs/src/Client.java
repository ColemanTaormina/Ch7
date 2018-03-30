public class Client {

	public static void main(String[] args) {
		extentiongoogle player1 = new extentiongoogle(100,4, (int)Math.random()*5 +1);
		extentionsafiri player2 = new extentionsafiri(10,5, 4);
		
		System.out.println("Googles strength is "+player1.getStrength());
		System.out.println("Safiri strength is "+player2.getStrength());
		
		System.out.println("Googles health is "+player1.getHealth());
		System.out.println("Safiri health is "+player2.getHealth());
		System.out.println();
		
		
		while (player1.getHealth()>0 && player2.getHealth()>0) {
		
			if (player1.getHealth()>0) {
		player1.googleAttacks(player2);
		System.out.println("Google attacks player two, player twos health is:"+ player2.getHealth());
			}
		if (player2.getHealth()>0) {
		player2.safiriAttacks(player1);
		System.out.println("Safiri attacks player one, player ones health is:"+ player1.getHealth());
		}
		if (player1.getHealth()<=0){
		System.out.print("Safiri two wins");
	}else if (player2.getHealth()<=0) { 
			System.out.print("Google one wins");
		
		}
		
		
		
		

	
	
	
	
		}
	}
	
}
