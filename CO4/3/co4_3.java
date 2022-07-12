import java.util.*;

class authenticate_exec extends Exception
{
	authenticate_exec(String msg)
	{
		super(msg);
	}
}
public class co4_3 {
public static void main(String args[])
{
	String name,pass;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter name");
	name=s.nextLine();
	System.out.println("Enter password");
	pass=s.nextLine();
	
		try 
		{
			if(name.matches("vaishnav") || name.matches("1234"))
			{
				System.out.println("Login successful");
				
			}
			else
			{
				throw new authenticate_exec("Invalid username or password");	
			}

		}
		catch(authenticate_exec e)
		{
			System.out.println(e.getMessage());
		}

}
}
