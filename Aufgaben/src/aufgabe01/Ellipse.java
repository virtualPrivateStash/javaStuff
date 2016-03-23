package aufgabe01;

import aufgabe01.AbstractShape;
import aufgabe01.MyPoint;

public class Ellipse extends AbstractShape{
	
	public Ellipse(MyPoint p) {
		this.setWidth(p.getX());
		
	}

	@Override
	public double getArea() {

		return 0;
	}
	
	

}
