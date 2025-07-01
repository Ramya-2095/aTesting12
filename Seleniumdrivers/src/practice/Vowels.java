package practice;

public class Vowels {

	public static void main(String[] args) {
		String s="aei@12Tru";
		int cc=0,vc=0;
		for(int i=0;i<=s.length()-1;i++) {
			char ch = s.charAt(i);
			if(Character.isAlphabetic(ch)) {
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					vc++;
				}
				else {
					cc++;
				}
			}
			
		}
		System.out.println(vc);
		System.out.println(cc);
	}

}
