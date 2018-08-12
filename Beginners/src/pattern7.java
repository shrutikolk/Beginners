/*
 * pattern 7
1 
4 4 
3 3 3 
16 16 16 16 
5 5 5 5 5 

 */
public class pattern7
{
	public static void main(String args[])
	{
		int i,j;
		for(i = 1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
				if(i%2!=0)
					System.out.print(i+" ");
				else 
					System.out.print(i*i+" ");
			System.out.println();
		}	
	}
}
