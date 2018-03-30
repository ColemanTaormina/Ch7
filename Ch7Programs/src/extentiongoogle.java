
public class extentiongoogle extends Warrior {
	private int speed;
	private int z;
	public extentiongoogle(int health, int strength, int con) {
		super(health, strength);
		speed= con;
	super.setStrength(strength*speed);
	
	}
	public void googleAttacks(Warrior enemy) {
		int random = (int) (Math.random()*5+1);
		speed= random;
		enemy.setHealth (enemy.getHealth()-(speed*getStrength()));
	System.out.println("Google has a speed boost allowing for extra damage the speed is "+speed);
	System.out.println();
	} 
}
