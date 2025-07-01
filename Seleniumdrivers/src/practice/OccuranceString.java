package practice;

public class OccuranceString {

	public static void main(String[] args) {
		String s="abbcadefggrrtta";
		char mostrepeated=' ';
		int maxcount=0;
		char[] ch = s.toCharArray();
		boolean b[]=new boolean[ch.length];
		for(int i=0;i<=ch.length-1;i++) {
			if(b[i]==false) {
				int count=1;
				for(int j=i+1;j<=ch.length-1;j++) {
					if(ch[i]==ch[j]) {
						count++;
						b[j]=true;
					}
					
				}
				if(count>maxcount) {
					maxcount=count;
					mostrepeated=ch[i];
					
			
					System.out.println(mostrepeated);
					
		
					
						
				}

			}
		}
		

	}

}
