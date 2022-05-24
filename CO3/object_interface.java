import java.util.*;
public class object_interface
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int ch,x;
		inter i;
		circle ob1=new circle();
		rectangle ob2=new rectangle();
		do
		{
			System.out.println("1.Area of Circle\n2.Area of Rectangle\n3.Perimeter of Circle\n4.Perimeter of Rectangle\nEnter your choice");
			ch=s.nextInt();
			switch(ch)
			{
				case 1: i=ob1;
					  i.area();
					  break;
				case 2: i=ob2;
					  i.area();
					  break;
				case 3: i=ob1;
					  i.peri();
					  break;
				case 4: i=ob2;
					  i.peri();
					  break;	
				default:System.out.println("Invalid entry");
					  break;
					   
			}
			System.out.println("Do you want to continue ? (0/1)");
			x=s.nextInt();	
		}
		while(x!=0);
	}
}
interface inter
{
	void area();
	void peri();
}
class circle implements inter
{
	public void area()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter raidus of the circle ");
		int r=s.nextInt();
		System.out.print("Area of the circle = "+(3.14*r*r));
		System.out.println();
	}
	public void peri()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter raidus of the circle ");
		int r=s.nextInt();
		System.out.print("Perimeter of the circle = "+(2*3.14*r));
		System.out.println();
	}
}
class rectangle implements inter
{
	public void area()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of the rectangle ");
		int l=s.nextInt();
		System.out.println("Enter the breadth of the rectangle ");
		int b=s.nextInt();
		System.out.print("Area of the rectangle = "+(l*b));
		System.out.println();
	}
	public void peri()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of the rectangle ");
		int l=s.nextInt();
		System.out.println("Enter the breadth of the rectangle ");
		int b=s.nextInt();
		System.out.print("Perimeter of the rectangle = "+(2*(l+b)));
		System.out.println();
	}
}