package javaArraysprogram;

import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
		int[] a= {50,40,30,20,10,10};
		//Arrays.sort(a);
		//System.out.println(Arrays.toString(a));
		for(int i=0;i<=a.length-1;i++) {
			for(int j=i+1;j<=a.length-1;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}

		}
		System.out.println(Arrays.toString(a));

	}

}
