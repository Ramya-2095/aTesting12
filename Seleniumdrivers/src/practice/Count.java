package practice;

public class Count {

	public static void main(String[] args) {
		String s="Ram@124";
		int ac=0,dc=0,sc=0;
		for(int i=0;i<=s.length()-1;i++) {
			char ch = s.charAt(i);
			if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z') {
				ac++;
			}
				else if(ch>='0'&&ch<='9') {
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
