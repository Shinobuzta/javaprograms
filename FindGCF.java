public class FindGCF {
	public static void main(String[] args) {
		
		System.out.println(getGCF(15,30,-45,105));
	}
	public static int getGCF(int... nums){
		
		boolean done=false;
		int currentGCF=0,i=1;

		while (!done) {
			if (isGCF(i,nums))
				currentGCF=i;

			if (isOver(i,nums))
				done=true;

			i++;
		}

		return currentGCF;
	}
	public static boolean isGCF(int i,int[] nums){
		for (int values:nums) {
			if (values%i!=0)
				return false;
		}
		return true;
	}
	public static boolean isOver(int i,int[] nums){
		for (int values:nums) {
			if (i<=values)
				return false;
		}
		return true;
	}
}