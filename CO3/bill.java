import java.util.*;

public class bill implements design
{
	int pid,qty,unit,total,ono;
	String name;
	Date d;
	
	public void additem()
	{
		System.out.println("\nEnter product id : ");
		pid=s.nextInt();
		s.nextLine();
		System.out.println("\nEnter product name : ");
		name=s.nextLine();
		System.out.println("\nEnter quantity : ");
		qty=s.nextInt();
		System.out.println("\nEnter unit price of the product : ");
		unit=s.nextInt();
		s.nextLine();
		total=unit*qty;
	}
	public void getHeader()
	{
		d=new Date();
		System.out.println("\nEnter order number : ");
		ono=s.nextInt();
		s.nextLine();
	}
	public void putHeader()
	{
		System.out.println("\nOrder No : "+ono);
		System.out.println("\nDate : "+d.toString());
	}
	public void display()
	{
		System.out.format("%12d %10s %12d %12d %10d",pid,name,qty,unit,total);
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int ch=1;
		int n=5,i=0,net=0;
		bill newbill[]=new bill[n];
		while(ch==1&&i<n)
		{
			System.out.println("Item "+(i+1));
			newbill[i]=new bill();
			if(i==0)
			{
				newbill[i].getHeader();
			}
			newbill[i].additem();
			i++;
			System.out.println("Press 1 to add more items");
			ch=s.nextInt();
		}
		newbill[0].putHeader();
		System.out.printf("%12s %10s %12s %12s %10s","Product id","Name","Quantity","Unit price","Total");
		System.out.println();
		for(int z=0;z<65;z++)
		{
			System.out.print("-");
		}
		System.out.println();
		for(int j=0;j<i;j++)
		{
			newbill[j].display();
			System.out.println();
		}
		for(int z=0;z<65;z++)
		{
			System.out.print("-");
		}
		System.out.println();
		for(int j=0;j<i;j++)
		{
			net+=newbill[j].total;
		}
		System.out.println("Net. Amount : "+net);
	}
}
interface design
{
	Scanner s=new Scanner(System.in);
	public void display();
	void additem();
	void getHeader();
	void putHeader();
}