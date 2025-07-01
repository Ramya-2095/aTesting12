package practice;

import net.bytebuddy.asm.Advice.Return;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="gadag";
		if(ispallindrome(s)) {
			System.out.println("pallindrome");
		}
			else 
				System.out.println("not");
			
		}
			
		public static boolean ispallindrome(String s) {
		//int i=0,j=s.length()-1;
		//while(i<j) {
			//if(s.charAt(i)!=s.charAt(j)) {
				//return false;
			//}
			//i++; j--;

		//}
		//return true;
		//}
			// String rev = new StringBuffer(s).reverse().toString();
			return (s.equals(new StringBuffer(s).reverse().toString()));
				// return true;
			 
				//return false;
			}
			

	}





