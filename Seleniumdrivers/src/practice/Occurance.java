package practice;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {10,20,10,30,40,50,40,60,10,40};
		boolean[] b=new boolean[a.length];
		int mostrepeated=0,maxcount=0;
		for(int i=0;i<=a.length-1;i++) {
			if(b[i]==false) {
				int count=1;
				
			for(int j=i+1;j<=a.length-1;j++) {
				if(a[i]==a[j]) {
					count++;
					b[j]=true;
				}
			
			if(count>maxcount) {
				maxcount=count;
				mostrepeated=a[i];
		}

		}

	}
	}
		System.out.println(mostrepeated);

}
}


