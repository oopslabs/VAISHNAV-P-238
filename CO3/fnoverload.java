import java.util.*;
public class fnoverload
{
	void area(int a)
	{
		System.out.println("Area of Square = "+a*a);
	}
	void area(int l,int b)
	{
		System.out.println("Area of Rectangle= "+l*b);
	}
	void area(float r)
	{
		System.out.println("Area of Circle= "+3.14*r*r);
	}
	public static void main(String[] args)
	{
		int ch;
		Scanner s=new Scanner(System.in);
		fnoverload ob=new fnoverload();
		System.out.println("-----SQUARE-----");
		System.out.println("Enter side of the square :");
		int x=s.nextInt();
		ob.area(x);
		System.out.println("-----RECTANGLE-----");
		System.out.println("Enter length of the rectangle :");
		int y=s.nextInt();
		System.out.println("Enter breadth of the rectangle :");
		int z=s.nextInt();
		ob.area(y,z);
		System.out.println("-----CIRCLE-----");
		System.out.println("Enter radius of the circle :");
		int w=s.nextInt();
		ob.area(w);
		s.close();
	}
}
