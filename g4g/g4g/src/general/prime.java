package general;

public class prime {

	public static void main(String[] args) {
		
	    
	/*	 int flag=0;
         for(int i=2; i<num; i++){
             if(num%i==0){
                 flag=0;
                 break;
                }
             else
            	 flag=1;
             
	}
         
         if(flag==1)
        	 System.out.println("prime");

         else
        	 System.out.println("not prime");*/
		int num=315;
		
		while (num%2 == 0)
	    {
	       System.out.println(2);
	        num = num/2;
	    }
		
		for (int i = 3; i <= (num); i = i+2)
	    {
	        // While i divides n, print i and divide n
	        while (num%i == 0)
	        {
	            System.out.println(i);
	            num = num/i;
	        }
	    }
		
		
   }
}





