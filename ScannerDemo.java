import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
	System.out.print("Enter firstnumber :");
	Scanner scan = new Scanner(System.in);
	int fnum = scan.nextInt();
	System.out.print("Enter second number :");
	int snum = scan.nextInt();
	int answer = fnum + snum;
	System.out.print("the sum is" + answer);


	}
}
