
public class overloading {
	public static void main(String[] args) {
	String a= " Tom";
	String b= " Swift ";
	
	String c=greet(a);
	String d=greet(a,b);
	
	System.out.print(c+"\n"+d);
	}
	public static String greet(String a) {
String c="Dear"+a;
		
		return c;
	}
		public static String greet(String a, String b) {
			String d="Dear"+a+""+b;
			return d;
		}
	}
