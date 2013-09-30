public class LE4Prime_Chrysan{

	public static void main(String[] args)
	{
		int ctr=0;
		for (int y=1; ctr<100; y++) 
		{
			int zero=0;
			
			for(int j=1; j<=y; j++)
			{
				if(y%j==0)
				{
					zero++;
				}
			}

			if(zero==2)
			{
				System.out.print(""+y+"\t");
				ctr++;
			}
		}

			
		}
			
	
	}

