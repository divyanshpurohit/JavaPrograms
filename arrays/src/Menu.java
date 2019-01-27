import java.util.*;   

class Menu 

{
	static void display (int a[])

{
	int i;
	System.out.println("Elements of the array are .");
	for (i=0;i<5;i++)
		System.out.print(a[i]+" ");
	System.out.println();
}

	static void sum(int a[])
	{
		System.out.print("Sum of elements of the array is:");
		int sum=0;
		for (int i=0;i<5;i++)
			sum+=a[i];
		System.out.println(sum);
	}
	static void large(int a[])
	{
		int l;
		 l=a[0];
		for (int i=1;i<5;i++)
			if(a[i]>l)
				l=a[i];
			System.out.println("Largest element in the array is :"+l);
	}
static int  small(int a[])
	{
		int l;
		 l=a[0];
		for (int i=1;i<5;i++)
			if(a[i]<l)
				l=a[i];
			//System.out.print("Smallest element in the array is :"+l);
	
			return l;
	}


static void small2(int a[])
{
	int l;
	if (a[0]==small(a))
		l=a[1];
	else
		l=a[0];
	for (int i=0;i<5;i++)
		{
			if (a[i]== small(a))
			continue;
			else 
			if (a[i]<l)
			l=a[i];
			} 
			System.out.println("Second smallest number in the array is :"+l);
}

static void altsum(int a[])
{
	int sum =0;
	for (int i=0;i<5;i=i+2)
		sum+=a[i];
	System.out.println("sum of alternate elements of the array is :"+sum);
}

static void even(int a[])
{
	int count =0;
	for(int i=0;i<5;i++)
		if(a[i]%2==0)
			count++;
		System.out.println("no of even elements is :"+count);

}
static void freq(int a[],int n)
{
	int count=0;
	for(int i=0;i<5;i++)
		if (a[i]==n)
			count ++;
		if (count ==0)
			System.out.print("Number not found. \n ");
		else
			System.out.println("Number found "+count+"times."); 
	

}


	public static void main (String args[])

{
	Scanner in =new Scanner(System.in);
	int a[];
	a= new int[5];
	System.out.println("Enter 5 elements");
	int i,n;
	for (i=0;i<5 ;i++ ) 
	{
		a[i]=in.nextInt();
	}

	System.out.print("MENU: \n");
	System.out.print("1. Display elements.\n2. Sum of all the elements.\n3.Largest number in the array.\n4.Smallest number in the array.\n5.Second largest number in the array.\n6.Sum of alternate elements in the array.\n7.Count of even numbers in the array.\n8.Occurrence of a given number in the array and its frequency.\n ");
    int b;
	System.out.print("Enter your choice:");
	b=in.nextInt();
	switch(b)
	{
		case 1: display(a);break;
		case 2: sum(a);break;
		case 3: large(a);break;
		case 4: System.out.println("smallest element of the array is :"+small(a));break;
		case 5: small2(a);break;
		case 6: altsum(a);break;
		case 7: even(a);break;
		case 8: System.out.println("enter no.to be searched");
				n=in.nextInt();
				freq(a,n);break;
		default:System.out.print("enter valid option .");			


	}

}
}	