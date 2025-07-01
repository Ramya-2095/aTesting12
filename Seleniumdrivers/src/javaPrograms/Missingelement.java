package javaPrograms;

public class Missingelement {

	public static void main(String[] args) {
		int[] a= {4,3,1,9,10};
		int big=a[0];
		int small=a[0];
		for(int i=1;i<=a.length-1;i++ ) {
			if(a[i]>big) {
				big=a[i];
				
			}
			if(a[i]<small) {
				small=a[i];
			}
		}
		//System.out.println(big);
		//System.out.println(small);
		for(int i=small+1;i<=big-1;i++) {
		if(ismissing(i,a)) {
			System.out.println(i);
			
		}
		

	}
	}
	public static boolean ismissing(int n,int a[]) {
		for(int i=0;i<a.length-1;i++) {
			if(n==a[i]) {
				return false;
			}
		}
		return true;

	}

		
	}


