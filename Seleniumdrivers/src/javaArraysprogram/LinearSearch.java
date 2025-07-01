package javaArraysprogram;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a= {10,20,30,40};
		int n=20;
		int b=(linearsearch(a,n)) ;
			
		if(b==-1) {
			System.out.println("element not found");
		}
		else {
			System.out.println("element is found at index "+b);
		}
	}
	public static int linearsearch(int[] a, int n) {
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]==n) {
				return i;
			}
		}
		return -1;
	}

}
