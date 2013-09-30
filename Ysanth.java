public class Ysanth {
	public static void main(String[] args) {
		//System.out.println(getRemainder(100,30));
		LE5_Chrysan x = new LE5_Chrysan();
		x.printDetails(args);
	}
	public static int getRemainder(int dividend, int divisor){
		while(dividend>=divisor)
		{
			dividend=dividend-divisor;
		}
		return dividend;

	}
}