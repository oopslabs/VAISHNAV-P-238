import java.io.*;
import java.util.*;
public class co4_6
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter starting of even number-range");
		int st=s.nextInt();
		System.out.println("Enter ending of even number-range and fibonnaci series");
		int l=s.nextInt();
		even ob1=new even(st,l);
		fib ob2=new fib(l);
		Thread t1=new Thread(ob1);
		Thread t2=new Thread(ob2);
		t1.start();
		t2.start();
	}
}

class even implements Runnable
{
	int m,n;
	public even(int i,int j)
	{
		m=i;
		n=j;		
	}
	
	public synchronized void run()
	{
		System.out.println("Even Numbers from "+m+"to"+n);
		for(int i=m;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}

class fib implements Runnable
{
	int n;
	
	public fib(int j)
	{
		n=j;
	}
	
	public synchronized void run()
	{
		System.out.println("Fibonacci series upto "+n);
		int a=0,b=1,c=0;
		System.out.println(a);
		System.out.println(b);
		while((a+b)<n)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}

		
		
		