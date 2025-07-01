package javaPrograms;

public class Biggestele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,6,7,8};
		int big=a[0];
		for(int i=1;i<=a.length-1;i++) {
			if(a[i]<big) {
				big=a[i];
			}
		}
		System.out.println(big);

	}

}
