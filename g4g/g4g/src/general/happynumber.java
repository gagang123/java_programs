package general;

public class happynumber {

	public static void main(String[] args) {
		

		int rem=0;
		int sum=0;
		int n=67;
		while(n>0){
			 rem=n%10;
			sum+= rem*rem;
			
			n=n/10;
		}
		
		if(sum==1)
			
		
		System.out.println(sum);
	}

}
