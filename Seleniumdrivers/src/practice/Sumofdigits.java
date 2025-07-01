package practice;

public class Sumofdigits {

	public static void main(String[] args) {
		String s="abc@123";
		int sum=0;
		for(int i=0;i<=s.length()-1;i++) {
			char ch = s.charAt(i);
			if(Character.isDigit(ch)) {
				sum=sum+ch-48;
			}
		}
System.out.println(sum);
	}

}
