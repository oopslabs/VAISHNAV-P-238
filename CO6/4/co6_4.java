import java.io.*;
import java.util.Scanner;
public class co6_4
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream fr = new FileInputStream("C:/MCA/OOP_LAB/COS/CO6/4/integer.txt");
		FileOutputStream fw1 = new FileOutputStream("C:/MCA/OOP_LAB/COS/CO6/4/even.txt");
		FileOutputStream fw2 = new FileOutputStream("C:/MCA/OOP_LAB/COS/CO6/4/odd.txt");
		System.out.println("\nCopied Successfully\n");
		int i;
		while((i=fr.read()) != -1)
		{
			if(i%2==0)
				fw1.write(i);
			else
				fw2.write(i);
		}
		fr.close();
		fw1.close();
		fw2.close();
	}
}