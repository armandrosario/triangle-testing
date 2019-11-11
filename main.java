import java.util.Arrays;
import java.util.Scanner;
class main {

	public static void main(String[] args) {
		
		Triangle tri1=new Triangle();
		double sideLengths[]= new double[3];
		int go=1;
		int a=0;
		int option=0;
		Scanner scanner = new Scanner(System.in);
		while(go==1) {
			System.out.println("Type '1' to enter side lengths or '0' to enter points.");
			option=scanner.nextInt();
			if(option==1) {
				System.out.println("Enter a value: ");
				sideLengths[0]=scanner.nextDouble();
				System.out.println("Enter b value: ");
				sideLengths[1]=scanner.nextDouble();
				System.out.println("Enter c value: ");
				sideLengths[2]=scanner.nextDouble();
				Arrays.sort(sideLengths);
				tri1=new Triangle(sideLengths[0],sideLengths[1],sideLengths[2]);
			}
			else if(option==0) {
				double x1,y1,x2,y2,x3,y3;
				System.out.println("Enter x1 value: ");
				x1=scanner.nextDouble();
				System.out.println("Enter y1 value: ");
				y1=scanner.nextDouble();
				System.out.println("Enter x2 value: ");
				x2=scanner.nextDouble();
				System.out.println("Enter y2 value: ");
				y2=scanner.nextDouble();
				System.out.println("Enter x3 value: ");
				x3=scanner.nextDouble();
				System.out.println("Enter y3 value: ");
				y3=scanner.nextDouble();
				tri1=new Triangle(x1,y1,x2,y2,x3,y3);

				
			}
			System.out.println(tri1.getType());
			if(tri1.getType()!="Invalid type")
			{
				System.out.println("Type '1' to get AREA or '0' to skip.");
				a=scanner.nextInt();
				if(a==1) {
					System.out.println("Area: "+tri1.getArea());
				}
			}
			else {
				System.out.println("Invalid Triangle.");
			}
			System.out.println("Type '1' to continue or '0' to end session.");
			go=scanner.nextInt();
		}
		System.out.println("Session terminated.");
		scanner.close();
	}

}
