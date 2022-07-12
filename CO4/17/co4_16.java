import java.util.*;

public class co4_16
{
	public static void main(String[] args)
	{
		HashSet<String> s1=new HashSet<>();
		HashSet<String> s2=new HashSet<>();
		HashSet<String> s3=new HashSet<>();
		s1.add("A");
		s1.add("B");
		s1.add("C");
		s1.add("D");
		
		s2.add("A");
		s2.add("B");
		s2.add("C");
		s2.add("D");
		
		s3.add("A");
		s3.add("B");
		s3.add("C");
		s3.add("D");
		s3.add("E");
		
		System.out.println("Hash Set 1: "+s1+"\nHash Set 2: "+s2+"\nHash Set 3: "+s3);
		System.out.println("Hash sets 1 and 2 are equal ? : "+s1.equals(s2));
		System.out.println("Hash sets 1 and 3 are equal ? : "+s1.equals(s3));
		
		
	}
}