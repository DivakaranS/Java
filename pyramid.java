
class pyramid
{
	public static void main(String[] arg) 

	{

		int i,x=8;
		for(i=1;i<=x;i++)
		{

			for(int j=1;j<=x-i;j++)
			{

				System.out.print(" ");
			}
			for (int k=i;k>=1;k--)
			{
				if(k>=10)
				{
					System.out.print(" "+k);
				}
				else
				{
					System.out.print(" "+k);
				}
			}

			for( int k=2;k<=i;k++)
			{
				if(k>=10)
				{
					System.out.print(" "+k);
				}
				else
				{
					System.out.print(" "+k);
				}
			}
			System.out.println(" ");
		}
	}
}