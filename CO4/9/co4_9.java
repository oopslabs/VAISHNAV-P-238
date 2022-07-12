import java.util.*;
public class co4_9
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int l=s.nextInt();
		Integer[] arr=new Integer[l];
		System.out.println("Enter the elements");
		for(int i=0;i<l;i++)
		{
			arr[i]=s.nextInt();
		}
		Bubblesort<Integer> b1=new Bubblesort<>(arr);
		System.out.println("Entered Array");
		b1.display();
		System.out.println();
		b1.sort();
		System.out.println("Array after performing bubblesort");
		b1.display();
		
	}
}

class Bubblesort<T extends Comparable<? super T>>
{
	T array[];
	int n;
	Bubblesort(T a[])
	{
		this.array=a;
		
	}
	
	void display()
	{
		System.out.println();
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}
	
	void sort()
	{
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=0;j<array.length-n-1;j++)
			{
				if(array[j].compareTo(array[j+1])>0)
				{
					swap(j,array);
				}
			}
		}
		
	}
	void swap(int j,T[] array)
	{
		T temp=array[j];
		array[j]=array[j+1];
		array[j+1]=temp;
	}
	
}