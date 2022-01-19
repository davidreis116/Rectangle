package entities;

public class Rectangle {
	
	public double width;
	public double height;
	
	public double area (double a, double b) {
		return a* b;
	}
	
	public double perimeter (double a, double b) {
		return 2 * (a + b);
	}
	
	public double diagonal (double a, double b) {
		return a +b;
	}

}
