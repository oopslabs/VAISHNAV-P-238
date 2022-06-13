import java.util.*;
class PercExce extends Exception
{
    
    public PercExce(String msg)
    {
        super(msg);
    }
}
public class pexception 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int rollno;
        float m1,m2,m3,total=0,perc=0;
        String name;
        System.out.println("Enter details of students");
        System.out.print("Enter roll no : ");
        rollno=s.nextInt();
        s.nextLine();
        System.out.print("Enter name of the student : ");
        name=s.nextLine();
        System.out.print("Enter marks of subject 1 (out of 100) : ");
        m1=s.nextFloat();
        System.out.print("Enter marks of subject 2 (out of 100) : ");
        m2=s.nextFloat();
        System.out.print("Enter marks of subject 3 (out of 100) : ");
        m3=s.nextFloat();
        total=m1+m2+m3;
        perc=(total/300)*100;
        System.out.println("-----Student Details-----");
        System.out.println("Roll no : "+rollno);
        System.out.println("Name : "+name);
        System.out.println("Mark 1 : "+m1);
        System.out.println("Mark 2 : "+m2);
        System.out.println("Mark 3 : "+m3);
        System.out.print("Total marks = "+total);
        System.out.println();
        System.out.print("Percentage = "+perc+"%");
        System.out.println();
        try 
        {
            if(perc<40)
            {
                throw new PercExce("Failed");
            }
            else
            {
                System.out.println("Passed");
            }
            

        }  
            
        
         catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
    

    }
}