import java.util.*;   

class Sorting

{
	public static void main (String args[])

	{
		int i,j;
		Scanner in =new Scanner(System.in);
		int a[]=new int[20];
        int b[]=new int[10];
        
        System.out.println("How many nos. are you going to enter ? ");
        int x=in.nextInt();
        System.out.println("enter the first array (sorted)");

        for (i=0;i<x;i++)
             a[i]=in.nextInt();
        i=x;
        System.out.println("How many nos. are you going to enter ? ");
        int y=in.nextInt();
        System.out.println("enter the second array (sorted)");                            
        for(j=0;j<y;j++)
              b[j]=in.nextInt();  
        for (j=0;j<y;j++,i++) 
        a[i]=b[j];
       int n,min,c;
       n=x+y;
        for (i = 0; i < n-1; i++) 
    { 
        // Find the minimum element in unsorted array 
        min = i; 
        for (j = i+1; j < n; j++) 
          if (a[j] < a[min]) 
            min = j; 
  
        // Swap the found minimum element with the first element 
        c=a[i];
        a[i]=a[min];
        a[min]=c;

        
    } 
                         
            

for (i=0;i<n;i++)
System.out.print(a[i]+" ");
    
}  

}