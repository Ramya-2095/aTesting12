package practice;

import java.util.Arrays;

import net.bytebuddy.asm.Advice.Return;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,30,40};
		int[] b= {100,200,300,400,500};
		int[] d=merge(a,b);
		System.out.println(Arrays.toString(d));
		

	}
	public static int[] merge(int[] a,int[] b) {
		int[] c=new int[a.length+b.length];
		for(int i=0;i<=a.length-1;i++) {
			c[i]=a[i];
			
		}
		for(int i=0;i<=b.length-1;i++) {
			c[a.length+i]=b[i];
		}
		return c;
		
	}

}
