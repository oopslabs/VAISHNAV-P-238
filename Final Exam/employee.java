import java.util.*;
public class employee
{
	int eNo,eSalary;
	String eName;
	employee(int e,String n,int s)
	{
		eNo=e;
		eName=n;
		eSalary=s;
	}
	

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int eno,esal;
		String ename;
		System.out.println("Enter the number of employees :");
		int n=s.nextInt();
		employee ob[]=new employee[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("ENTER DETAILS OF EMPLOYEE "+(i+1));
			System.out.println("Enter employee number :");
			eno=s.nextInt();
			s.nextLine();
			System.out.println("Enter employee name :");
			ename=s.nextLine();
			System.out.println("Enter employee salary :");
			esal=s.nextInt();
			ob[i]=new employee(eno,ename,esal);
		}
		System.out.println("-----EMPLOYEE DETAILS-----");
		for(int i=0;i<n;i++)
		{
			System.out.println("Details of Employee "+(i+1));
			System.out.println("Employee number :"+ob[i].eNo);
			System.out.println("Employee name :"+ob[i].eName);
			System.out.println("Employee salary :"+ob[i].eSalary);
		}
		int ch=1;
		do
		{
			int f=0;
			System.out.println("Enter eno of the employee to be searched");
			int e=s.nextInt();
			for(int i=0;i<n;i++)
			{
				if(ob[i].eNo==e)
				{
					f=1;
				}
			
			}
			if(f==1)
			{
				System.out.println("Employee found");
			}
			else
			{
				System.out.println("Employee not found");
			
			}
			
			System.out.println("Do you want to search again ? Press 0 or 1");
			ch=s.nextInt();
			
		}while(ch==1);
		
		
		
		
		
		
		
	}
}