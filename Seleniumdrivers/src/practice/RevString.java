package practice;

import java.util.Arrays;

public class RevString {
	public static void main(String args[]) {
		String s="Ramya";
		// String rev="";
		//char[] ch = s.toCharArray();
		//for(int i=ch.length-1;i>=0;i--) {
			//rev=rev+ch[i];
			
		//}
		
		//System.out.println(rev);
		//System.out.println(s);

		char temp;
		char[] ch = s.toCharArray();

		int i=0;
		int j=ch.length-1;
		while(i<j) {
			temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
			
		}
		System.out.println(ch);
		s=new StringBuffer(s).reverse().toString();
		System.out.println(s);

		
	}
	
	

}
