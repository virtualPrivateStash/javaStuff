package aufgabe01;

import aufgabe01.MyPoint;

public interface Shape {

	void setCenter(MyPoint p);
	MyPoint getCenter();
	void setWidth(double d);
	double getWidth();
	void setHeight(double d);
	double getHeight();
	double getArea();
}
