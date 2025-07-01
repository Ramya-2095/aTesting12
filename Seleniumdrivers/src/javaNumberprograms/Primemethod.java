package javaNumberprograms;

public class Primemethod {

	public static void main(String[] args) {
		int n=7;
		if(isprime(n)) {
			System.out.println("prime");
		}
		else {
			System.out.println("not");
		}

	}
	public static boolean isprime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
