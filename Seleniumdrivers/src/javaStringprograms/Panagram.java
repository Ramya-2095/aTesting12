package javaStringprograms;

import java.util.HashSet;

public class Panagram {

	public static void main(String[] args) {
		String s="abcdefghijklmnopqrstuvwxyz";
		if(ispanagram(s)) {
			System.out.println("its panagram");
		}
		else {
			System.out.println("not a panagram");
		}
	}
	public static boolean ispanagram(String s) {
		s=s.toLowerCase();
		HashSet hs=new HashSet();
		char[] ch = s.toCharArray();
		for(int i=0;i<=ch.length-1;i++) {
			if(Character.isAlphabetic(ch[i])) {
			hs.add(ch[i]);
			}
			
			
		}
		System.out.println(hs.size()+"size");

		return( hs.size()==26);
	}

}
