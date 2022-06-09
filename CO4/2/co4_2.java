import arithmetic.*;
import java.util.*;
public class co4_2
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		calculations c=new calculations(a,b);
		c.add();
		c.sub();
		c.mul();
		c.div();
	}
}