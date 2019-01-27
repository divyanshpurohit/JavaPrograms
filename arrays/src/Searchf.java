import java.util.*;   


class Searchf

{
	public static void main (String args[])

	{
		int i;
		Scanner in =new Scanner(System.in);
		int a[]=new int[5];
        System.out.print("Enter 5 elements  \n");
        for(  i=0;i<a.length;i++)

        a[i]= in.nextInt();
                    

		 System.out.print("Enter number whose index is to be searched :  ");
         int x=in.nextInt();
          System.out.print(" \n Elements of the array are :  ");
          for (i=0;i<5;i++)
            System.out.print(a[i]);
        System.out.print("\n"+search(a,x));
                    



    
}  

static int search (int [] a, int x)
{
    int i;
    for(i=0;i<5;i++)
    {
        if (x==a[i])
            return i;
    }//end of for
    return -1;    
}//end of func


} 