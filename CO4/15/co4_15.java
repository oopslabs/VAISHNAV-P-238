import java.util.LinkedHashSet;

public class co4_15 
{

	public static void main(String[] args) 
	{

     		LinkedHashSet<String> ls = new LinkedHashSet<>();
     		System.out.println("Inserting 'A','B','D' and 'C'");
     		ls.add("A");
     		ls.add("B");
     		ls.add("D");
     		ls.add("C");
    	 	System.out.println("LinkedHashSet: "+ ls);
     		System.out.println("Inserting 'A' and 'E' ");
     		ls.add("A");
     		ls.add("E");
     		System.out.println("LinkedHashSet: "+ ls);
     
     		System.out.println("Size of LinkedHashSet: "+ ls.size());

     		System.out.println("Removing D from LinkedHashSet: "+ ls.remove("D"));

     		System.out.println("Trying to Remove Z which is not present: " + ls.remove("Z"));

     		System.out.println("Checking if A is present: "+ ls.contains("A"));
     		System.out.println("Checking if Z is present: "+ ls.contains("Z"));  
     
     		System.out.println("LinkedHashSet: "+ ls);
 	}
}