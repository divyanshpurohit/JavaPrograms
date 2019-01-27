import java.util.Scanner;

 class PascalTriangle
{
    public static void main(String args[])
	{
	    int n, i, k, x=1, j;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number of rows: ");
		n = in.nextInt();
		
		for(i=0;i<n;i++)
		{
			for(k=n; k>i; k--)
			{
				System.out.print(" ");
			}
            x = 1;
			for(j=0;j<=i;j++)
			{
				 System.out.print(x+ " ");
                 x =x * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}
}