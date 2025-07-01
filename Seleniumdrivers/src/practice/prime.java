package practice;
import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter one integer number");
		int n=scn.nextInt();//5
		int i=2;
		int count=0;
		while(true) {
		if(isprime(i)) {
			//System.out.println(i);
			count++;
	
		}
		if(count==n){
			System.out.println(i);

			break;
		}
		i++;

	}
	}
	public static boolean isprime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
			
		}
		return true;
	}

}
