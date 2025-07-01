package javaNumberprograms;

public class Armstrong {

	public static void main(String[] args) {
		int n=153;
		if(isArmstrong(n)) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("not");
		}
	}
	public static boolean isArmstrong(int n) {
		int count=countofdigit(n);
		int sum=0; int temp=n;
		while(n>0) {
			int rem=n%10;
			 int power = (int)Math.pow(rem, count);
			 sum=sum+power;
			 n=n/10;
		}
		return temp==sum;
	}
	public static int countofdigit(int n) {
		int count=0;
		while(n>0) {
			int rem=n%10;
			count++;
			n=n/10;
		}
		return count;
	}
}
