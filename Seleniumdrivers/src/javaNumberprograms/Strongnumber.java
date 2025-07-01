package javaNumberprograms;

public class Strongnumber {

	public static void main(String[] args) {
		int n=145;
		if(isStrong(n)){
			System.out.println("strong");
			
		}
		else {
			System.out.println("not");
		}
	}
	public static boolean isStrong(int n) {
		int sum=0,temp=n;
		while(n>0) {
			int rem=n%10;
			int fact=factorial(rem);
			sum=sum+fact;
			n=n/10;
		}
		return sum==temp;
	}
	public static int factorial(int n) {
	int	prod=1; 
		for(int i=n;i>=2;i--) {
			prod=prod*i;
		}
		return prod;
	}

}
