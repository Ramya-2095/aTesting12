package javaNumberprograms;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=101;
		if(ispallindrome(n)) {
			System.out.println("pallindrome");
		}
		else {
			System.out.println("not");
		}

	}
	public static boolean ispallindrome(int n) {
		int rev=0; int temp=n;
		while(n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev==temp;
	}

}
