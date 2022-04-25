
import java.util.*;

public class product {
	int pcode;
	String pname;
	float price;
	public static void main(String[] args)
	{
		product ob1 = new product();
		product ob2 = new product();
		product ob3 = new product();
		
		Scanner x = new Scanner(System.in);
		
		System.out.println("Enter details of first product");
		System.out.println("Enter product code");
		ob1.pcode=x.nextInt();
		x.nextLine();
		System.out.println("Enter product name");
		ob1.pname=x.nextLine();
		System.out.println("Enter product price");
		ob1.price=x.nextFloat();

		System.out.println("Enter details of second product");
		System.out.println("Enter product code");
		ob2.pcode=x.nextInt();
		x.nextLine();
		System.out.println("Enter product name");
		ob2.pname=x.nextLine();
		System.out.println("Enter product price");
		ob2.price=x.nextFloat();
		
		System.out.println("Enter details of third product");
		System.out.println("Enter product code");
		ob3.pcode=x.nextInt();
		x.nextLine();
		System.out.println("Enter product name");
		ob3.pname=x.nextLine();
		System.out.println("Enter product price");
		ob3.price=x.nextFloat();
		
		System.out.println("Details of first product");
		System.out.println("Product code : "+ob1.pcode);
		System.out.println("Product name : "+ob1.pname);
		System.out.println("Product code : "+ob1.price);
		
		System.out.println("Details of second product");
		System.out.println("Product code : "+ob2.pcode);
		System.out.println("Product name : "+ob2.pname);
		System.out.println("Product code : "+ob2.price);
		
		System.out.println("Details of third product");
		System.out.println("Product code : "+ob3.pcode);
		System.out.println("Product name : "+ob3.pname);
		System.out.println("Product code : "+ob3.price);
		
		if((ob1.price<ob2.price) && (ob1.price<ob3.price))
		{
			System.out.println("First product have lowest price");
		}
		else if((ob2.price<ob1.price) && (ob2.price<ob3.price))
		{
			System.out.println("Second product have lowest price");
		}
		else
		{
			System.out.println("Third product have lowest price");
		}
		
		
		
		
		
	}

}
