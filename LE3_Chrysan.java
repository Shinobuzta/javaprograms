public class LE3_Chrysan{
	
	public static void main(String[] args) {
		 int num1=36;
		 int num2=10;

		 System.out.println("The product of " + num1 + " and " + num2 + " " + "is: " + getProduct(num1,num2));
		 System.out.println("The integer quotient of " + num1 + " and " + num2  + " " + "is: " + getQuotient(num1,num2));
		 System.out.println("The integer remainder of " + num1 + " and " + num2  + " " + "is: " + getRemainder(num1,num2));
	}
	public static int getProduct(int num1, int num2)
	{
		int ans=0;
		
		for(int x=0; x<num1; x++)
		{
			ans=ans+num2;
		}
		return ans;
	}
	public static int getQuotient(int dividend, int divisor)
	{
		
		int ans=0;
		
		while (dividend>=divisor)
		{
			dividend=dividend-divisor;
			ans=ans+1;
		}
		return ans;
		
	}
	public static int getRemainder(int dividend, int divisor)
	{

		while (dividend>=divisor)
	 	{
	 		dividend=dividend-divisor;
		}
		return dividend;
	}
}