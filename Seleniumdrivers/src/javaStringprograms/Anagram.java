package javaStringprograms;

import java.util.Arrays;


public class Anagram {

	public static void main(String[] args) {
		String s1="listen";
		String s2="silent";
		if(isanagram(s1,s2)) {
			System.out.println("is anagram");
		}
		else {
		System.out.println("not anagram");
		}
		
	}
	public static boolean isanagram(String s1,String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		s1.toLowerCase();
		s2.toLowerCase();
		char[] ch1 = s1.toCharArray();
		Arrays.sort(ch1);
		char[] ch2 = s2.toCharArray();
		Arrays.sort(ch2);
		return Arrays.equals(ch1, ch2);
		
	}
	

}
