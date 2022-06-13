import java.util.*;
class student
{
    int sid;
    String name,branch;
    student(int s,String n,String b)
    {
        sid=s;
        name=n;
        branch=b;
    }
    void display()
    {
        System.out.println("-----STUDENT INFORMATION LIST-----");
        System.out.println("Student ID : "+sid);
        System.out.println("Student Name : "+name);
        System.out.println("Branch of Study : "+branch);

    }
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int stud_id;
        String sname,sbranch;
        int n;
        int i=0;
        System.out.println("Enter the number of students : ");
        n=s.nextInt();
        student sob[]=new student[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter details of student no."+(i+1));
            System.out.print("Enter student id : ");
            stud_id=s.nextInt();
            s.nextLine();
            System.out.print("Enter student name : ");
            sname=s.nextLine();
            System.out.print("Enter branch of study : ");
            sbranch=s.nextLine();
            sob[i]=new student(stud_id,sname,sbranch);    
        }
        for(i=0;i<n;i++)
        {
            sob[i].display();
        }
        
        
    }
}
