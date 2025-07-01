package javaArraysprogram;

import java.util.Arrays;

public class Reversearray {
	public static void main(String[]args) {
	int[] a= {10,30,20,40,70};
	System.out.println(Arrays.toString(a));

	int i=0;
	int j=a.length-1;
	while(i<j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		i++;
		j--;
	}
	System.out.println(Arrays.toString(a));
}
}
