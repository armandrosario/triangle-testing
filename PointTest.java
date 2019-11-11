import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PointTest {
	private Point p;
	@Test
	void Point1() {
		p=new Point();
		assertEquals(p.getX(),0);
		assertEquals(p.getY(),0);
	}
	@Test
	void Point2() {
		p=new Point(0,0);
		assertEquals(p.getX(),0);
		assertEquals(p.getY(),0);
	}
	@Test
	void getX() {
		p=new Point(0,0);
		assertEquals(p.getX(),0);
		
	}
	@Test
	void getY() {
		p=new Point(0,0);
		assertEquals(p.getY(),0);
		
	}

}
