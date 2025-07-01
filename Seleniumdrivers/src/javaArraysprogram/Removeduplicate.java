package javaArraysprogram;

public class Removeduplicate {

	public static void main(String[] args) {
		int[]  a= {10,20,30,30,20,40,50};
		boolean b[]=new boolean[a.length];
		for(int i=0;i<=a.length-1;i++) {
			if(b[i]==false) {
				int count=1;
				for(int j=i+1;j<=a.length-1;j++) {
					if(a[i]==a[j]) {
						b[j]=true;
						count++;
					}
				}
				if(count==1)
				System.out.println(a[i]);
			}
		}
	}

}
