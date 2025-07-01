package javaStringprograms;

public class Pallindrome1 {

	public static void main(String[] args) {
		String s="gadaga";
		//System.out.println(s.charAt(0));
		if(ispallindrome(s)) {
			System.out.println("pallindrome");
		}
		
		System.out.println("not pallindrome");
	}
	public static boolean ispallindrome(String s) {
		
	
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	
}
}
