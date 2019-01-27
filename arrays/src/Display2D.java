import java.util.*;   

class Display2D

{
	public static void main (String args[])

	{
		
		int i,j;
		Scanner in =new Scanner(System.in);
		int a[][]=new int[5][5];
		System.out.print("Enter elements:");
		for (i=0;i<5;i++)
		{
			
				for (j=0;j<5;j++)
				{
					a[i][j]=in.nextInt();
				if (a[i][j]>=100)	
					{
						System.out.println(" ERROR:Enter a number with to digits only. ");
						System.out.println("re-eneter element");
						
						j--;

					}//end of if 
				}//end of innner for 


			}//end of outer for 
		
		System.out.println("Array:");
		for (i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			System.out.print(a[i][j]+" ");
			System.out.print("\n");

		}
	
		for (i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
				if(a[i][j]%2==0)
					continue;
				else 
					a[i][j]*=2;
		}

		System.out.println("Array after multiplying odd elements by 2:");
		for (i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			System.out.print(a[i][j]+" ");
			System.out.print("\n");

		}
	

	}

}	