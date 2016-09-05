package Array;

public class RemoveELement {

	public static void main(String[] args) {
		int [] arr= {2,3,4,2,2,2,4};
		System.out.println(arr.length);
		
		int value=2;
		int count=0;
		
		/*for(int i=0; i<arr.length; i++){
			
			if(arr[i]==value)
				count++;
		}
		
  
		
		System.out.println(arr.length-count);*/
		
		
        
	     for(int i=0; i<arr.length; i++){
	    	  
	    	  if(arr[i]!=value)
	    	  arr[count++]=arr[i];
	    	 }
	     System.out.println(count);
	     
	   /*  while(count<arr.length){
	    	 arr[count++]=value;
	     }
	      */  	
	    for(int i=0; i<arr.length; i++){
	    	  
	    	 System.out.print(arr[i]+" ");
	      }
	    
	    //System.out.println(count);
	}
}
