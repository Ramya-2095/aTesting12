package practice;

public class Lastcharutol {

	public static void main(String[] args) {
		String s="Ramya is Good Girl";
		s=s.trim().replaceAll("\\s+", " ");
		char[] ch = s.toCharArray();
		for(int i=0;i<=ch.length-1;i++) {
			if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ') {
				if(Character.isLowerCase(ch[i])) {
					ch[i]=Character.toUpperCase(ch[i]);
				}
			}
			else if(Character.isUpperCase(ch[i])) {
				ch[i]=Character.toLowerCase(ch[i]);
			}
		}
		System.out.println(ch);
	}

}
