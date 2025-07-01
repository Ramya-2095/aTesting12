package javaArraysprogram;

public class Pallindrome {

	public static void main(String[] args) {
		char[] ch= {'a','a','c','a','a','c'};
		if(ispallindrome(ch)) {
			System.out.println("pallindrome");
		}
		else {
			System.out.println("not");
		}
	}
	public static boolean ispallindrome(char[] a) {
		int i=0;
		int j=a.length-1;
		while(i<j) {
			if(a[i]!=a[j]) {
				return false;
				
			}
			i++;
			j--;
		}
		
		return true;
	}

}
