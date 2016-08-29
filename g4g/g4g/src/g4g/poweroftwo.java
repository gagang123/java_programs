package g4g;

public class poweroftwo {

	public static void main(String[] args) {
		int n=8;
		
		if(( n & (n-1))== 0)
			System.out.println("power of two" );
		else
			System.out.println("not a power of 2");

	}

}
