package javaStringprograms;

public class Lowertoupper_lower {

	public static void main(String[] args) {
		String s="RaMYa";
		char[] ch = s.toCharArray();
		for(int i=0;i<=ch.length-1;i++) {
			if(ch[i]>='a'&&ch[i]<='z') {
				ch[i]=(char) (ch[i]-32);
			}
			else if(ch[i]>='A'&&ch[i]<='Z') {
				ch[i]=(char) (ch[i]+32);
			}
			
		}
		System.out.println(ch);
		s=new String(ch);
		System.out.println(s);

	}

}
