package javaStringprograms;

public class Sumofdigit {

	public static void main(String[] args) {
		String s="ram@143";
		int sum=0;
		for(int i=0;i<=s.length()-1;i++) {
			char ch = s.charAt(i);
			if(Character.isDigit(ch)) {
				int digit=ch-48;
				sum+=digit;
			}
		}
		System.out.println(sum);
	}

}
