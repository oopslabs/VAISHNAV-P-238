import java.util.*;
class person
{
	String name,gender,address;
	int age;
	person(String n,String gen,String addr,int ag)
	{
		this.name=n;
		this.gender=gen;
		this.address=addr;
		this.age=ag;
	}
}
class employee extends person
{
	int empid;
	double salary;
	String cname,quali;
	employee(String n,String gen,String addr,int ag,int eid,double sal,String cmpname,String qual)
	{
		super(n,gen,addr,ag);
		this.empid=eid;
		this.salary=sal;
		this.cname=cmpname;
		this.quali=qual;
	}
}
class teacher extends employee
{
	String subject,dept;
	int tchrid;
	teacher(String n,String gen,String addr,int ag,int eid,double sal,String cmpname,String qual,String sub,String dep,int tid)
	{
		super(n,gen,addr,ag,eid,sal,cmpname,qual);
		this.subject=sub;
		this.dept=dep;
		this.tchrid=tid;	
	}
	void display()
	{
		System.out.println("Name of the person : "+this.name);
		System.out.println("Gender : "+this.gender);
		System.out.println("Address : "+this.address);
		System.out.println("Age : "+this.age);
		System.out.println("Employee id : "+this.empid);
		System.out.println("Company name : "+this.cname);
		System.out.println("Qualification : "+this.quali);
		System.out.println("Salary : "+this.salary);
		System.out.println("Teacher id : "+this.tchrid);
		System.out.println("Subject : "+this.subject);
		System.out.println("Department : "+this.dept);
	}
}
public class person_inheritance
{
	public static void main(String args[])
	{
		String name,gender,addr,cname,qual,sub,dept;
		int age,empid,tid,n;
		double salary;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of teachers : ");
		n=s.nextInt();
		teacher obj[]=new teacher[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter details of Teacher "+(i+1));
			System.out.println("Enter the employee id : ");
			empid=s.nextInt();
			s.nextLine();
			System.out.println("Enter the name of the person : ");
			name=s.nextLine();
			System.out.println("Enter the gender : ");
			gender=s.nextLine();
			System.out.println("Enter the address : ");
			addr=s.nextLine();
			System.out.println("Enter the age : ");
			age=s.nextInt();
			s.nextLine();
			System.out.println("Enter the company name : ");
			cname=s.nextLine();
			System.out.println("Enter qualification : ");
			qual=s.nextLine();
			System.out.println("Enter salary : ");
			salary=s.nextDouble();
			System.out.println("Enter the teacher id : ");
			tid=s.nextInt();
			s.nextLine();
			System.out.println("Enter subject : ");
			sub=s.nextLine();
			System.out.println("Enter department : ");
			dept=s.nextLine();
			obj[i]=new teacher(name,gender,addr,age,empid,salary,cname,qual,sub,dept,tid);	
		}
		System.out.println("-----TEACHER DETAILS-----\n");
		for(int i=0;i<n;i++)
		{
			System.out.println("Details of Teacher "+(i+1));
			obj[i].display();
		}
	}
}