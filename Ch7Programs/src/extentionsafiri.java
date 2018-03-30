
public class extentionsafiri extends Warrior{
private int dodge;
private int y;
public extentionsafiri(int health, int strength, int con) {
	super(health, strength);
	dodge= con;



super.setHealth(health*dodge);

}
public void safiriAttacks(Warrior enemy) {
	int random = (int) (Math.random()*2+1);
	dodge= random;
	super.setHealth (super.getHealth()*dodge);
	enemy.setHealth (enemy.getHealth()-(getStrength()));
	
System.out.println("Safiri has a health boost allowing for extra health the dodge is "+dodge);
System.out.println();
} 
}
