public class DateRunner {
public static void main(String[] args) {
	Date ColeBDay= new Date(8,12,1999, "says Cole");
	Date friendBDay= new Date(5,9,2000, "says Noah");
	Date today= new Date();
	System.out.println("First date "+ColeBDay.getDay()+","+ColeBDay.getMonth()+","+ColeBDay.getYear()); 
	System.out.println("SecondDate "+friendBDay.getDay()+","+friendBDay.getMonth()+","+friendBDay.getYear()); 
ColeBDay.Older(friendBDay);
}
}
