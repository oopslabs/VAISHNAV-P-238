import graphics.*;
import java.util.*;
public class co4_1
{
	public static void main(String[] args)
	{
		Scanner s =new Scanner(System.in);
		int rad,len,bred,side,base,heig;

		System.out.print("Enter radius of the circle : ");
		rad=s.nextInt();
		circle c=new circle(rad);
		System.out.print("Area of circle = ");
		c.area();

		System.out.print("Enter length of the rectangle : ");
		len=s.nextInt();
		System.out.print("Enter breadth of the rectangle : ");
		bred=s.nextInt();
		rectangle r=new rectangle(len,bred);
		System.out.print("Area of rectangle = ");
		r.area();

		System.out.print("Enter base of the triangle : ");
		base=s.nextInt();
		System.out.print("Enter height of the triangle : ");
		heig=s.nextInt();
		triangle t=new triangle(base,heig);
		System.out.print("Area of triangle = ");
		t.area();

		System.out.print("Enter side of the square : ");
		side=s.nextInt();
		square sq=new square(side);
		System.out.print("Area of square = ");
		sq.area();
		
		
	}
}