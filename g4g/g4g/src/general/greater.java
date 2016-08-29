package general;

public class greater {

	public static void main(String[] args) {
		int x=922;
		int y=7711;
		
		
		int z= x-y;
		
		int i= (z>>31) & 1;
		
		int max= x - i*z;
		
		System.out.println(max);
		

	}

}
