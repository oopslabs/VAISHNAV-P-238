import java.util.*;
public class complex
{
	float real,img;
	Scanner s=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter real part of the complex number");
		real=s.nextFloat();
		System.out.println("Enter imaginary part of the complex number");
		img=s.nextFloat();
	}
	void display()
	{
		System.out.println("Complex number is : "+real+"+"+img+"i");
	}
public static void main(String[] args)
{
	complex ob1=new complex();
	ob1.input();
	ob1.display();
	complex ob2=new complex();
	ob2.input();
	ob2.display();
	float sreal,simg;
	sreal=ob1.real+ob2.real;
	simg=ob1.img+ob2.img;
	System.out.println("Sum of complex numbers = "+sreal+"+"+simg+"i");
	
	
}
}