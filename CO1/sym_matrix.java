import java.util.*;
public class sym_matrix
{
	public static void main(String[] args)
	{
		int m[][]=new int[10][10];
		int i,j,n,flag=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of the matrix");
		n=s.nextInt();
		System.out.println("Enter the matrix");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				m[i][j]=s.nextInt();
			}
		}
		System.out.println("Entered matrix is : ");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(m[i][j]!=m[j][i])
				{
					flag=1;
				}
			}
		}
		if(flag==1)
		{
			System.out.println("Matrix is not symmetric");
		}
		else
		{
			System.out.println("Matrix is symmetric");
		}
	}
}