package javaNumberprograms;

public class Prime {

	public static void main(String[] args) {
		int n=3;
		int count=0;
		
			//if(n<=1) {
				//System.out.println("its not prime number");
				for(int i=1;i<=n;i++) {
					if(n%i==0) {
						count++;
					}
				
					if(count==2) {
						System.out.println("its prime");
					}
			}
		}
	}


