public class Exam1
{
	public static void main(String[] args) {
		System.out.print(multiply2(1,2,3,5,10));
	}
	public static int multiply(int a,int b,int c)
	{
		int result=0;
		for (int i=0;i<a;i++ ) {
			result +=b;
		}
		int result2=0;
		for (int i=0;i<c ;i++ ) {
		 	result2+=result;
		 }
		 return result2; 
	}
	public static int multiply2(int... a)
	{
		int result=1;
		int result2=0;	
		for (int i=0;i<a.length;i++ ){
			for (int i2=0;i2<a[i] ;i2++ ) {
		 	result2+=result;
		 	}
		 	result=result2;
		 	result2=0;
		}
		return result;
	}
}