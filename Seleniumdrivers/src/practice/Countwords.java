package practice;

public class Countwords {

	public static void main(String[] args) {
		String s=" Ramya is  good girl ";
		System.out.println(s.length());
		s=s.trim();
		System.out.println(s.length());
		s=s.trim().replaceAll("\\s+", " ");
		System.out.println(s.length());
		String[] word = s.split(" ");
		System.out.println(word.length);



		
	}

}
