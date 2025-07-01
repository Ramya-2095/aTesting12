package javaPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class Nthbiggest {

	public static void main(String[] args) {
		int n=2;
		int[] b= {10,20,30,40,30,20};
		int[] a=removeduplicate(b);
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(a[0]);
		System.out.println(a[a.length-n]);
	}
	public static int[] removeduplicate(int[] b) {
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int ele:b) {
			hs.add(ele);
		}
		System.out.println(hs.size());
		int c[]=new int[hs.size()];
		int index=0;
		for(int ele:hs) {
			c[index]=ele;
			index++;
		}
		return c;
	}


	}

