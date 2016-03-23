package aufgabe01;

public class MyPoint {

	private double x = 0;
	private double y = 0;
	
	public MyPoint(double argX, double argY) {
		x = argX;
		y = argY;
	}
	
	public void setX(double d) {
		 x = d;
	 }
	 
	public double getX() {
		 return x;
	 }
	 
	public void setY(double d) {
		 y = d;
	 }
	 
	public double getY() {
		 return y;
	 }
	 
	 @Override
	public String toString() {
		 return String.format("Point_x: %s, Point_y: %s", x, y);
	 }
}
