import java.util.*;   

class Search

{
	public static void main (String args[])

	{
		int i;
		Scanner in =new Scanner(System.in);
		int count=0;
        int a[]=new int[5];
        System.out.print("Enter 5 elements  \n");
        for(  i=0;i<5;i++)

            a[i]= in.nextInt();
                    

		 System.out.print("Enter number whose index is to be searched :  ");
         int x=in.nextInt();
          System.out.print(" \n Elements of the array are :  ");
          for (i=0;i<5;i++)
             System.out.print(a[i] + " ");
         for (i=0;i<5;i++)
         {
            if(count==0)
           { 
            if (a[i]==x)
                 {
                    System.out.print(" \n The Number is present at index :"+ i);
                    count=1;
                }
            }
            else
                if(a[i]==x)
                     System.out.print(","+i);
         }

           if (count==0)
            System.out.print("\n"+ (-1));
            
            



    
}  

}