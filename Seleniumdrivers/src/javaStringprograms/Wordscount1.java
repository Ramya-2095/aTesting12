package javaStringprograms;

public class Wordscount1 {

	public static void main(String[] args) {
		String s=" ramya  is very good girl";
		char[] ch = s.toCharArray();
		int count=0;
		for(int i=0;i<=ch.length-1;i++) {
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
