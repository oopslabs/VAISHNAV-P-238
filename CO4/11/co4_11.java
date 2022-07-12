import java.util.*;
public class co4_11
{
	public static void main(String args[]) 
	{
		LinkedList<String>l1=new LinkedList<>();
		l1.add("Hello");
		l1.add("How");
		l1.add("Are");
		l1.add("You");
		System.out.println("Linked List");
		Iterator<String> itr=l1.iterator(); 
	 	while(itr.hasNext())
		{ 
	 	 	  System.out.println(itr.next()); 
	 	} 
		l1.clear();
		System.out.println();
		System.out.println("Linked List after clearing"+"\n"+l1);
	}
}