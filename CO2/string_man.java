import java.util.*;
public class string_man
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s1=s.nextLine();
		System.out.println("Enter position : ");
		int n=s.nextInt();
		System.out.println("Character at position "+n+" is : "+s1.charAt(n));
		System.out.println("Unicode of character at position "+n+" is : "+s1.codePointAt(n));
		System.out.println("Length of the string : "+s1.length());
		s.nextLine();
		System.out.println("Enter a new string : ");
		String s2=s.nextLine();
		System.out.println("Concatenated strings are : "+s1.concat(s2));
		System.out.println("Whether the strings are equal or not : "+s1.equals(s2));
		System.out.println("Strings in upper case : ");
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toUpperCase());
		System.out.println("Strings in lower case : ");
		System.out.println(s1.toLowerCase());
		System.out.println(s2.toLowerCase());
	}
}