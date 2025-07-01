package javaPrograms;

import java.util.Arrays;

public class Merge {

	public static void main(String[] args) {
		int[] a= {10,1,3,5,9};
		int small=a[0];
		int big=a[0];
		for(int i=1;i<=a.length-1;i++) {
			if(a[i]>big) {
				big=a[i];
			}
			if(a[i]<small) {
				small=a[i];
			}
		}
		for(int i=small+1;i<=big-1;i++) {
			if(ismissing(i,a)) {
				System.out.println(i);
			}
		}
		
}
	public static boolean ismissing(int n,int[] a) {
		for(int i=0;i<=a.length-1;i++) {
			if(n==a[i]) {
				return false;
			}
		}
		return true;
		
	}
	}
