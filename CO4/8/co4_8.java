import java.io.*;
import java.util.*;
public class co4_8
{
	public static void main(String[] args)
	{
		Stack<Integer> ob1=new Stack<Integer>(3);
		System.out.println("Pushing 10,20,30 into an integer stack...");
		ob1.push(10);
		ob1.push(20);
		ob1.push(30);
		System.out.println("After pushing");
		ob1.display();
		ob1.pop();
		System.out.println("After poping");
		ob1.display();
		System.out.println("Pushing 40");
		ob1.push(40);
		System.out.println("After pushing");
		ob1.display();
		System.out.println("Top= "+ob1.topp());
		System.out.println();
		System.out.println("A String type stack");
		Stack<String> ob2=new Stack<>(3);
		ob2.push("Java");
		ob2.push("Programming");
		ob2.push("Tutorial");
		ob2.display();
		System.out.println("Top= "+ob2.topp());
	
		
	}
}

class Stack<T>
{
	ArrayList<T> stack;
	int n,top=-1;
	
	Stack(int i)
	{
		this.n=i;
		this.stack=new ArrayList<T>(i);
	}
	
	void push(T data)
	{
		if((top+1)==n)
		{
			System.out.println("Stack overflow");
		}
		else
		{
			top++;
			if(stack.size()>top)
			{
				stack.set(top,data);
			}
			else
			{
				stack.add(data);
			}
		}
	}
	
	void display()
	{
		for(int i=top;i>-1;i--)
		{
			System.out.println(stack.get(i));
		}
	}
	
	void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack underflow");
		}
		else
		{
			top--;
		}
	}
	T topp()
	{
		return(stack.get(top));
	}
	
}
	