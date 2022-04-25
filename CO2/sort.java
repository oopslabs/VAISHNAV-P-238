import java.util.*;
public class sort
{
	public static void main(String[] args)
	{
		String a;
		String temp;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the strings : ");
		a=s.nextLine();
		String ss[]=a.split(" ");
		for(int i=0;i<ss.length;i++)
		{
			for(int j=0;j<ss.length;j++)
			{
				if(ss[i].compareTo(ss[j])<0)
				{
					temp=ss[i];
					ss[i]=ss[j];
					ss[j]=temp;	
				}
			}
		}
		System.out.println("Sorted strings are : ");
		for(int i=0;i<ss.length;i++)
		{
			System.out.println(ss[i]);		
		}
	}
}