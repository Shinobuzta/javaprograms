public class Primes {
	public static void main(String[] args) {
		int ctr=0;
		long i=0;
		long[] primes = {2};

		outer:
		for (i=2; ctr<10001; i++) {
			for (long i2 : primes )
				if ((i%i2==0)&&i!=i2) {
					continue outer;
				}
			ctr++;
			long temp[] = new long[primes.length+1];
			System.arraycopy(primes, 0, temp, 0, primes.length);
			temp[primes.length]=i;
			primes=temp;
			//System.out.println(i);
		}
		System.out.println("2,000,000th prime:"+(i-1));
		//System.out.println(i2+"\t"+i);
		
	}
}
