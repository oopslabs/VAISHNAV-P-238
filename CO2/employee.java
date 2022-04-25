import java.util.*;
public class employee
{
	int eNo,eSalary;
	String eName;
	employee(int no,String name,int sal)
	{
		eNo = no;
		eName = name;
		eSalary = sal;
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String name;
		int no,sal,n,flag=0;
		System.out.print("Enter the number of employees : ");
		n = in.nextInt();
		System.out.println();
		employee obj[] = new employee[10];
		for(int i = 0;i < n;i++)
		{
			System.out.print("Enter the employee number: ");
			no = in.nextInt();
			in.nextLine();
			System.out.print("Enter the employee name : ");
			name = in.nextLine();
			System.out.print("Enter the employee salary : ");
			sal = in.nextInt();
			System.out.println();
			obj[i] = new employee(no,name,sal);
		}
		System.out.print("Enter the employee number to be searched: ");
		no = in.nextInt();
		for(int i=0;i<n;i++)
		{
			if(obj[i].eNo == no)
			{
				System.out.println("Employee number: "+ obj[i].eNo);
				System.out.println("Employee name : "+ obj[i].eName);
				System.out.println("Employee salary : "+ obj[i].eSalary);
				flag=1;
			}
		}
		if(flag == 0)
		{
			System.out.println("Employee not found");
		}
	}
}