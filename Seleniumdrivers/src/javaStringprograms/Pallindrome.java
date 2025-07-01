package javaStringprograms;

public class Pallindrome {

	public static void main(String[] args) {
		String s="gadag";
		if(ispallindrome(s)) {
			System.out.println("its pallindrome");
		}
		else {
			System.out.println("not a pallindrome");
		}
	}
	public static boolean ispallindrome(String s) {
		//String rev=new StringBuffer(s).reverse().toString();
	return	(s.equals(new StringBuffer(s).reverse().toString()));
		}
}


