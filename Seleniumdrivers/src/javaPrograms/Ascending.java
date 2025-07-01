package javaPrograms;

import java.util.Arrays;

public class Ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,9,8,7,6,5,1,2,3,4};
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
