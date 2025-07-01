package javaArraysprogram;

import java.util.Arrays;
import java.util.HashSet;


public class Secondmaximum {

	public static void main(String[] args) {
		int [] a= {50,10,40,20,20,10,30};
		int n=2;
		int[] b=removeduplicate(a);
		Arrays.sort(b);
		System.out.println(b[n-1]);
		System.out.println(b[b.length-2]);
	}
	public static int[] removeduplicate(int[] a) {
		HashSet<Integer> hs=new HashSet<Integer >();
		for(int ele:a) {
			hs.add(ele);
		}
		System.out.println(hs);
		System.out.println(hs.size());
		int [] c=new int[hs.size()];
		int index=0;
		for(int ele:hs) {
			c[index]=ele;
			index++;

		}
		return c;
	}
	

}
