import java.util.*;
class cpu
{
	int price;
	cpu(int p)
	{
		price=p;
	}
	void display()
	{
		System.out.println("Price of CPU = "+price);
	}
	class processor
	{
		int cores;
		String pmf;
		processor(int c,String m)
		{
			cores=c;
			pmf=m;	
		}
		void display()
		{
			System.out.println("Number of cores in the processor = "+cores);
			System.out.println("Manufacturer name of the processor = "+pmf);
		}
	}
	static class ram
	{
		int memory;
		String rmf;
		ram(int mr,String m)
		{
			memory=mr;
			rmf=m;
		}
		void display()
		{
			System.out.println("Memory size of the RAM = "+memory);
			System.out.println("Manufacturer name of the RAM = "+rmf);
		}
	}
	public static void main(String[] args)
	{
		int price;
		int cores;
		String pm;
		int memory;
		String rm;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter price : ");
		price=s.nextInt();
		System.out.println("Enter number of cores in the processor : ");
		cores=s.nextInt();
		s.nextLine();
		System.out.println("Enter manufacturer name of the processor : ");
		pm=s.nextLine();
		System.out.println("Enter size of the RAM : ");
		memory=s.nextInt();
		s.nextLine();
		System.out.println("Enter manufacturer name of the RAM : ");
		rm=s.nextLine();
		cpu c=new cpu(price);
		cpu.processor p=c.new processor(cores,pm);
		cpu.ram r=new ram(memory,rm);
		System.out.println("-----DETAILS-----");
		c.display();
		p.display();
		r.display();
	}
}