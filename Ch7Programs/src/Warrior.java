public class Warrior {
	
	private int health;
	private int strength;
	
	public Warrior(int y, int x) {
		health=y;
		
	strength=x;
		
	}
	
	public int getStrength() {
		//Returns players current strength
				return strength;
	}
	public void setStrength(int x) {
		strength=x;
	}
	public void setHealth(int x) {
		health=x;
	}
	public int getHealth() {
		//Returns players current health
		return health;
	}
	
	public void safiriAttacks(Warrior enemy) {
		enemy.health -=  strength;
	}

	public void googleAttacks(Warrior enemy) {
		enemy.health -= strength;
	}

}

