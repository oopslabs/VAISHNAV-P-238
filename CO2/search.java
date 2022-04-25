import java.util.*;
public class search
{
	public static void main(String[] args)
	{
		int a[],m,n,k=0,flag=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array : ");
		m=s.nextInt();
		a=new int[m];
		System.out.println("Enter the array elements : ");
		for(int i=0;i<m;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter element to be searched : ");
		n=s.nextInt();
		for(int i=0;i<m;i++)
		{
			k++;
			if(a[i]==n)
			{
				System.out.println("Element "+n+" found at position : "+k);
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Data not found");
		}	
	}
}
