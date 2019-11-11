import java.lang.Math;
import java.util.Arrays;
public class Triangle{
	private double a;
	private double b;
	private double c;
	private String type;
	private boolean isValid(double x,double y,double z) {
		if( (x>0 && y>0 && z>0) && (x+y>z) ) {
			return true;
		}
		else {
			return false;
		}
	}
	public Triangle(double x1,double y1,double x2,double y2,double x3,double y3) {
		double x,y,z;
		double [] lengths= new double[3];
		lengths[0]=Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
		lengths[1]=Math.sqrt(Math.pow(x3-x2,2)+ Math.pow(y3-y2,2));
		lengths[2]=Math.sqrt(Math.pow(x3-x1,2)+ Math.pow(y3-y1,2));
		Arrays.sort(lengths);
		x=lengths[0];
		y=lengths[1];
		z=lengths[2];
		if(isValid(x,y,z)) {
			a=x;
			b=y;
			c=z;
			determineType();

		}
		else {
			type="Invalid type";
		}
		
	}
	public Triangle(double x,double y,double z) {
		if(isValid(x,y,z)) {
			a=x;
			b=y;
			c=z;
			determineType();

		}
		else {
			type="Invalid type";
		}
	}
	public Triangle() {}
	public double getArea() {
		double s,x,area;
		s=(a+b+c)/2;
		x=s*(s-a)*(s-b)*(s-c);
		area=Math.sqrt(x);
		return area;
	}
	public String getType() {
		return type;
	}
	public void determineType() {
		if(a==b && b==c && a==c) {
			type="Equilateral Triangle";
		}
		else if((a==b) || (a==c)||(b==c) ) {
			if((a*a+b*b)==c*c) {
				type="Isosceles Right Triangle";
			}
			else {
				type="Isosceles Triangle";
			}
		}

		else if((a*a+b*b)==c*c) {
			type="Scalene Right Triangle";
		}
		else {
			type="Scalene Triangle";
		}
	}
}
