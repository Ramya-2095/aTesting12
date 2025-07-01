package javaPrograms;

public class Occurance {

	public static void main(String[] args) {
		int[] a= {2,3,2,4,4,4,5,6,7,7,7,7,8,8,9,10};
		boolean b[]=new boolean[a.length];
		int maxcount=0;
		int mostrep=0;
		for(int i=0;i<=a.length-1;i++) {
			if(b[i]==false) {
				int count=1;
				for(int j=i+1;j<=a.length-1;j++) {
					if(a[i]==a[j]) {
						count++;
						b[j]=true;
					}
				}
				if(count>maxcount) {
				maxcount=count;
				mostrep=a[i];
				}
				
			
			}
			
		}
		System.out.println(mostrep);
		}
	}



