package studio7;
public class Rectangle {
	private double length;
	private double width;
	
	public static void main(String [] args) {
		Rectangle R= new Rectangle();
		System.out.println(R.perimeter(10.0, 5.0));
	}
	public Rectangle() {
		length=5.0;
		width=10.0;
	}
	public double area(double length, double width) {
		double area= length * width;
		return area;
	}
	public double perimeter(double length, double width) {
		double perimeter = 2*length + 2*width;
		return perimeter;
	}
}

