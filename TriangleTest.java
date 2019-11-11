import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.*;
import org.junit.Assert.*;


class TriangleTest extends Triangle {
	private Triangle t;
	@Test
	void getAreaTest() {
		Triangle Tri=new Triangle(3,4,5);
		double expected=6;
		double answer=Tri.getArea();
		assertEquals(expected,answer);
	}
	@Test
	void getTypeE() {
		Triangle Tri=new Triangle(3,4,5);
		String type="";
		assertNotSame(type,Tri.getType());
	}
	@Test
	void constructorTest() {
		t=new Triangle(0,0,0,3,4,0);
		assertEquals(6,t.getArea());
	}
	@Test
	void determineTypeTest() {
		Triangle Tri=new Triangle(3,4,5);
		assertEquals(Tri.getType(),"Scalene Right Triangle");
	}
	@Test
	void determineTypeTest2() {
		Triangle Tri=new Triangle(3,3,3);
		assertEquals(Tri.getType(),"Equilateral Triangle");
	}
	@Test
	void determineTypeTest3() {
		Triangle Tri=new Triangle(1,1,Math.pow(2, .5));
		System.out.println(Tri.getType());
		assertEquals(Tri.getType(),"Isosceles Right Triangle");
	}
	@Test
	void determineTypeTest4() {
		Triangle Tri=new Triangle(7,12,15);
		assertEquals(Tri.getType(),"Scalene Triangle");
	}
	@Test
	void determineTypeTest5() {
		Triangle Tri=new Triangle(10,10,13);
		assertEquals(Tri.getType(),"Isosceles Triangle");
	}
	

}
