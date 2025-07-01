package practice;
import java.util.Scanner;




public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter integer number");
		int n=scn.nextInt();
		if(ismagic( n)){
			System.out.println("its magic number");
		}
		else {
		
			System.out.println("its not magic number");
		}

		
	}
	public static boolean ismagic(int n) {//97
		while(n>9) {
			int sum=0;
			while(n>0) {
				int rem=n%10;//7
				sum=sum+rem;
				n=n/10;
				}
			n=sum;
			if(n==1) {
				return true;
			}
		}
		return false;

		
	}
	
	

}
