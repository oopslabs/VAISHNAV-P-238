package arithmetic;
public class calculations implements arith_interface
{
	int a,b;
	public calculations(int i,int j)
	{
		this.a=i;
		this.b=j;
	}
	public void add()
	{
		System.out.println("Sum="+(a+b));
	}
	public void sub()
	{
		
		System.out.println("Difference="+(a-b));
	}
	public void mul()
	{
		System.out.println("Product="+(a*b));
	}
	public void div()
	{
		System.out.println("Quotient="+(a/b));
	}
}