import java.util.*;
public class matrix
{
	public static void main(String[] args)
	{
		int i,j;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no.of rows");
		int r=s.nextInt();
		System.out.println("Enter no.of columns");
		int c=s.nextInt();
		int m1[][]=new int[r][c];
		int m2[][]=new int[r][c];
		int res[][]=new int[r][c];
		System.out.println("Enter elements of 1st matrix");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				m1[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter elements of 2nd matrix");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				m2[i][j]=s.nextInt();
			}
		}
		System.out.println("1st matrix : ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(m1[i][j]+"\t");
				
			}
			System.out.println();
		}
		System.out.println("2nd matrix : ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(m2[i][j]+"\t");
				
			}
			System.out.println();
		}
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				res[i][j]=m1[i][j]+m2[i][j];
			}
		}
		System.out.println("Sum of matrices : ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(res[i][j]+"\t");
				
			}
			System.out.println();
		}
		
	}
}