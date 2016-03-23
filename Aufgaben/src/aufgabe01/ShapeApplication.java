package aufgabe01;

public class ShapeApplication {

	public static void main(String[] args) {
		MyPoint p = new MyPoint(1,2);
		Shape s1 = new Ellipse(p);
		Shape s2 = new Rectangle(p);
		System.out.println(s1 + ", " + s2);
		p.setX(10);
		// s1 und s2 sollten unveraendert bleiben:
		System.out.println(s1 + ", " + s2); 

	}

}
