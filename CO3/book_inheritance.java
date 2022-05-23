import java.util.*;
public class book_inheritance
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of books in Literature category");
		int l=s.nextInt();
		literature lb[]=new literature[l];
		for(int i=0;i<l;i++)
		{
			System.out.println("Enter details of book in Literature category");
			lb[i]=new literature();
		}
		System.out.println("Enter number of books in Fiction category");
		int f=s.nextInt();
		fiction fb[]=new fiction[f];
		for(int i=0;i<f;i++)
		{
			System.out.println("Enter details of book in Fiction category");
			fb[i]=new fiction();
		}
		int ch,x;
		do
		{
			System.out.println("\n1.Details of Literature Books\n2.Details of Fiction Books\nEnter the choice");
			ch=s.nextInt();
			switch(ch)
			{
				case 1 : System.out.println("\n-----LITERATURE CATEGORY-----");
				for(int i=0;i<l;i++)
				{
					lb[i].display();
				}
					 break;
				case 2 : System.out.println("\n-----FICTION CATEGORY-----");
				for(int i=0;i<f;i++)
				{
					fb[i].display();
				}
					 break;
				default: System.out.println("Wrong Choice");
					 break;
			}
			System.out.println("Do you want to continue ? (0/1)");
			x=s.nextInt();
		}
		while(x!=0);
	}
}
class publisher
{
	String pname;
	Scanner s=new Scanner(System.in);
	publisher()
	{
		System.out.println("Enter Publisher Name : ");
		pname=s.nextLine();
	}

}
class book extends publisher
{
	String bname,author;
	int price;
	book()
	{
		System.out.println("Enter Book Name : ");
		bname=s.nextLine();
		System.out.println("Enter Author Name : ");
		author=s.nextLine();
		System.out.println("Enter Price : ");
		price=s.nextInt();
	}
}
class literature extends book
{
	String type;
	literature()
	{
		type="Literature";
	}
	void display()
	{
		System.out.println("Book Name : "+bname);
		System.out.println("Author Name : "+author);
		System.out.println("Publisher Name : "+pname);
		System.out.println("Category : "+type);
		System.out.println("Price : "+price);
		System.out.println();

	}
}
class fiction extends book
{
	String type;
	fiction()
	{
		type="Fiction";
	}
	void display()
	{
		System.out.println("Book Name : "+bname);
		System.out.println("Author Name : "+author);
		System.out.println("Publisher Name : "+pname);
		System.out.println("Category : "+type);
		System.out.println("Price : "+price);
		System.out.println();

	}
}