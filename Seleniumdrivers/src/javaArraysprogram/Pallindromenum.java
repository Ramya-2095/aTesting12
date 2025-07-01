package javaArraysprogram;

public class Pallindromenum {

	public static void main(String[] args) {
		int[] a= {101,102,212};
		for(int i=0;i<=a.length-1;i++) {
			if(ispallindrome(a[i])) {
				System.out.println(a[i]);
			}
		}
	}
	public static boolean ispallindrome(int n) {
		int rev=0;
		int temp=n;
		while(n>0) {
			int rem=n%10;
			 rev=rev*10+rem;
			 n=n/10;
			
		}
		if(temp==rev) {
			return true;
		}
		return false;
	}

}
