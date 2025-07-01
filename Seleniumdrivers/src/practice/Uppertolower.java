package practice;


public class Uppertolower {

	public static void main(String[] args) {
		String s=" raM is  gooD gIrL";
		s=s.trim().replaceAll("\\s+", " ");
		char[] ch = s.toCharArray();
		for(int i=0;i<=ch.length-1;i++) {
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ') {
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


