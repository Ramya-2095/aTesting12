package javaStringprograms;

public class Upper_lower {

	public static void main(String[] args) {
		String s="RaMyA";
		char[] ch = s.toCharArray();
		for(int i=0;i<=ch.length-1;i++) {
			if(Character.isUpperCase(ch[i])) {
				ch[i]=Character.toLowerCase(ch[i]);
			}
			else if(Character.isLowerCase(ch[i])) {
				ch[i]=Character.toUpperCase(ch[i]);
			}
		}
		System.out.println(ch);
	}

}
