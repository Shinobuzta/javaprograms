public class Primes2 {
	public static void main(String[] args) {
		int ctr=0;
		long i=0;


		outer:
		for (i=2; ctr<10001; i++) {
			for (int i2=2;i2<=i;i2++)
				if ((i%i2==0)&&i!=i2) {
					continue outer;
				}
			ctr++;
			//System.out.println(i);
		}
		System.out.println("2,000,000th prime:"+(i-1));
		//System.out.println(i2+"\t"+i);
	}
}