package practice;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Ramya";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
		String name=new StringBuffer(s).reverse().toString();
		System.out.println(name);
		char[] ch = s.toCharArray();
		int i=0,j=ch.length-1;
		while(i<j) {
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;j--;
			

		}
		System.out.println(ch);
	}

}
