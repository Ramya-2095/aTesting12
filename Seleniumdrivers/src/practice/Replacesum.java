package practice;

import java.util.Arrays;

public class Replacesum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {12,32,14,15};

		for(int i=0;i<=a.length-1;i++) {
			int sum=0;

			while(a[i]>0) {
				int rem=a[i]%10;
				 sum=sum+rem;
				 a[i]=a[i]/10;
					a[i]=sum;

			}

		}
System.out.println(	Arrays.toString(a));		

		}
	

			}
		

	


