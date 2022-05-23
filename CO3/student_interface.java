import java.util.*;
public class student_interface implements student,sports
{
	void display()
	{
		System.out.println("Name of the Student : "+name+"\nAcademic score : "+academic_score+"\nSports score : "+sports_score);	
	}
	public static void main(String[] args)
	{
		student_interface obj=new student_interface();
		obj.display();
	}
}
interface student
{
	String name="Vaishnav";
	int academic_score=85;
}
interface sports
{
	int sports_score=90;
}