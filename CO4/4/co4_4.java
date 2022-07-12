import java.util.*;
public class co4_4
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=s.nextInt();
		int t=0,avg=0,m=n;
		System.out.println("Enter the numbers ");
		for(int i=0;i<n;i++)
		{
			try
			{
				t=s.nextInt();
				if(t<0)
				{
					n++;
					throw new neg_exec("Negative number entered");
				}
				else
				{
					avg+=t;
				}
			}
			catch(neg_exec e)
			{
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Average of n positive numbers: "+(avg/m));
		
	}
}

class neg_exec extends Exception
{
	neg_exec(String msg)
	{
		super(msg);
	}
}