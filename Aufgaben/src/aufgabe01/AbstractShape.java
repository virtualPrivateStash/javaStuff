package aufgabe01;

import aufgabe01.MyPoint;

public abstract class AbstractShape implements Shape{
	
	private MyPoint center;
	private double width;
	private double height;
	
	@Override
	public void setCenter(MyPoint p) {
		center.setX(p.getX());
		center.setY(p.getY());
	}

	@Override
	public MyPoint getCenter() {
		return center;
	}
	
	@Override
	public void setWidth(double d) {
		this.width = d;
	}
	
	@Override
	public double getWidth() {
		return width;
	}
	
	@Override
	public void setHeight(double d) {
		height = d;
	}
	
	@Override
	public double getHeight()  {
		return height;
	}

	
	
}
