package practice;

public class Upper {

	public static void main(String[] args) {
		String s="AbcDe";
		char[] ch = s.toCharArray();
		for(int i=0;i<=ch.length-1;i++) {
			if(Character.isUpperCase(ch[i])) {
				ch[i]=Character.toLowerCase(ch[i]);
			}
			else if(Character.isLowerCase(ch[i])) {
				ch[i]=Character.toUpperCase(ch[i]);
			}
		}
		String s1 = new String(ch);
		System.out.println(s1);
	}

}
