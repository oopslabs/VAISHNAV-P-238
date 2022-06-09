package graphics;
public class triangle implements inter
{
	int b,h;
	public triangle(int i,int j)
	{
		b=i;
		h=j;
	}
	public void area()
	{
		System.out.println(0.5*b*h);
	}
}