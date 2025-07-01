package javaStringprograms;

public class Digitsalpspclcount {

	public static void main(String[] args) {
		String s="Rammu@123";
		int ac=0,sc=0,dc=0;
		char[] ch = s.toCharArray();
		for(int i=0;i<=ch.length-1;i++) {
			if(ch[i]>='a'&&ch[i]<='z'||ch[i]>='A'&&ch[i]<='z') {
				ac++;
			}
			else if(ch[i]>='0'&&ch[i]<='9') {
				dc++;
			}
			else {
				sc++;
			}
		}
		System.out.println(ac);
		System.out.println(dc);
		System.out.println(sc);

	}

}
