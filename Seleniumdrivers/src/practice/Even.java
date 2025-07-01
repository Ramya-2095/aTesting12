package practice;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,4,6,8,9,3,10};
		int bignum=big(a);
		System.out.println(bignum);
	}
	public static int big(int[] a) {
		
		int big=a[0];
		for(int i=1;i<=a.length-1;i++) {
			if(a[i]>big) {
				big=a[i];
			}
		}
		return big;
	}
}
	


