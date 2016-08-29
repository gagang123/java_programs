package general;

public class sum {

	public static void main(String[] args) {
		sum s1= new sum();
		
		System.out.println("hello");
		System.out.println(s1.getSum(5, -4));
	}
	
	public int getSum(int a, int b) {
	       while(Math.abs(b)>0){
	        Math.abs(a++);
	        Math.abs(b--);
	       }
	       
	       return a ;
} 
	
}
	
