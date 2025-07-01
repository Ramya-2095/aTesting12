package practice;

public class Wordscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=" Ramya  is very good girl";
		s=s.trim().replaceAll("\\s+", " ");
		String[] a = s.split(" ");
		System.out.println(a.length);
		//System.out.println(s.length());
		//char[] ch = s.toCharArray();
		//int count=0;
		//for(int i=0;i<=ch.length-1;i++) {
			//if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ') {
				//count++;
			//}
		//}
		//System.out.println(count);
		

	}

}
