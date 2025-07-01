package practice;

public class Alphanumcount {

	public static void main(String[] args) {
		String s="ramRaj@143";
		int ac=0,dc=0,sc=0;
		for(int i=0;i<=s.length()-1;i++) {
		char ch = s.charAt(i);
		if(Character.isAlphabetic(ch)) {
			ac++;
		}
		else if(Character.isDigit(ch)) {
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
