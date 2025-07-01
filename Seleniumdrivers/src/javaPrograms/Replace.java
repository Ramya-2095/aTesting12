package javaPrograms;


public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {12,13,32,14,15};
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sum(a[i]);
			
		}
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}

	}
	public static int sum(int n) {
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum+=rem;
			n=n/10;
			
		}
		return sum;
		
	}

}
