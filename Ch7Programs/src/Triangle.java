public class Triangle {

		private	double x1;
		private	double y1;
		private double x2;
		private double y2;
		private double x3;
		private double y3;
	

		public Triangle() {
			this.x1=1;
			this.y1=2;
			this.x2=3;
			this.y2=4;
			this.x3=5;
			this.y3=6;
		}

	
		public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
			this.x1=x1;
			this.y1=y1;
			this.x2=x2;
			this.y2=y2;
			this.x3=x3;
			this.y3=y3;
		}
		public double x1() {
			return this.x1;
		}
		public double y1() {
			return this.x1;
		}public double x2() {
			return this.x1;
		}public double y2() {
			return this.x1;
		}public double x3() {
			return this.x1;
		}public double y3() {
			return this.x1;
		}
	public void lengthandperimeterandarea(){
		double a=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		double b=Math.sqrt(Math.pow(x3-x2, 2)+Math.pow(y3-y2, 2));
		double c=Math.sqrt(Math.pow(x1-x3, 2)+Math.pow(y1-y3, 2));
	double z=a+b+c;
	double s=.5*(z);
		System.out.println("side1 "+a);
				System.out.println("side2 "+b);
						System.out.println("side3 "+c);
							System.out.println("perimeter "+(z));
	double q=Math.sqrt(s*(s-a)*(s-b)*(s-c));
								System.out.println("area "+(q));
	
		double cos1=Math.acos(((Math.pow(b, 2)+Math.pow(c, 2)-Math.pow(a, 2))/(2*b*c)));
		double cos2=Math.acos(((Math.pow(c, 2)+Math.pow(a, 2)-Math.pow(b, 2))/(2*a*c)));
		double cos3=Math.acos(((Math.pow(a, 2)+Math.pow(b, 2)-Math.pow(c, 2))/(2*a*b)));
			System.out.println("angle1 "+Math.toDegrees(cos1));
			System.out.println("angle2 "+Math.toDegrees(cos2));
			System.out.println("angle3 "+Math.toDegrees(cos3));
	}
	
	}
