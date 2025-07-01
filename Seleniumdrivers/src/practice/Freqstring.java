package practice;

public class Freqstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abABcc1";
		char[] ch=s.toCharArray();
		
		boolean b[]=new boolean[s.length()];
		for(int i=0;i<=s.length()-1;i++) {
			if(b[i]==false) {
				int count=1;
			
			for(int j=i+1;j<=ch.length-1;j++) {
				if(ch[i]==ch[j]) {
					count++;
					b[j]=true;
					
				}
			}
			System.out.println(ch[i]+"-"+count);
		}
			
		}
	}
}



