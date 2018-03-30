
public class Date {

	private int year;
	private int month;
	private int day;
	private String name;
	
	public Date() {
		this.year=27;
		this.month=10;
		this.day=2017;
		this.name="C";
	}
	public Date(int d, int mon, int ye, String n) {
		this.year=ye;
		this.month=mon;
		this.day=d;
		this.name=n;
	}
	public int getDay() {
		return this.day;
	
}
	public int getMonth() {
		return this.month;
	
}
	public int getYear() {
		return this.year;
}
	public String getName() {
		return this.name;
}
	public void Older(Date friendBDay) {
		if (this.year>friendBDay.year) {
			System.out.println("Friend is older");
		}else if (this.year<friendBDay.year) {
				System.out.print(" I am older "+this.name);
			}else {
			System.out.print("Date");
			}
	}
	
}

