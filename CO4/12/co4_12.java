import java.util.*;
import java.io.*;

public class co4_12
{
	public static void main(String[] args)
	{
		Stack<String> st=new Stack<>();
		Scanner s=new Scanner(System.in);
		String str;
		System.out.println("Enter the number of items");
		int n=s.nextInt(); 
		s.nextLine();	
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			str=s.nextLine();
			st.push(str);
		}	
		System.out.println(st);
		System.out.println("Enter the position of the object to be removed");
		int in=s.nextInt();
		st.remove(in);
		System.out.println("Stack after removing the object at position "+in);
		System.out.println(st);
	}
}