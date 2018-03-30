
public class Car {
	private	double milespergallon;
	private	double capacity;
	private double distance;
	private double maxfuel;

	public Car(double milespergallon, double capacity, double distance) {
		this.milespergallon=milespergallon;
		this.capacity=capacity;
		this.distance=distance;
	this.maxfuel=maxfuel;
	}
	public double milespergallon() {
		return this.milespergallon;
	}
	public double capacity() {
		return this.capacity;
	}public double distance() {
		return this.distance;
	}
	public void Drive(){
		double fuel=capacity-(distance/milespergallon);
				System.out.println("ONLY "+fuel+" left in tank, refuel!" );
	}
	public void addGas(){
		double newfuel= capacity;
System.out.println("Now you are full, "+newfuel);
	}
}
