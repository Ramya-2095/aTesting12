package javaStringprograms;

public class Wordscount {

	public static void main(String[] args) {
		String s="ramya is  good girl ";
		s=s.trim().replaceAll("\\s+", " ");
		String[] s1 = s.split(" ");
	System.out.println(s1.length);	
	}

}
