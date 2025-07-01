package javaStringprograms;

public class Vowelscons {

	public static void main(String[] args) {
		String s="12eiobcdu";
		int vc=0,consonant=0;
		for(int i=0;i<=s.length()-1;i++) {
			char ch = s.charAt(i);
			if(Character.isAlphabetic(ch)) {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vc++;
			}
			else {
				consonant++;
			}
		}
		}
		System.out.println(vc);
		System.out.println(consonant);
		

	}

}
