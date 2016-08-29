package general;

public class aray {

	public static void main(String[] args) {
		 
        int b[]= {5,55,7,7,0,0,0,0,4,5,5,56,32,1};
       
     int count=0;
        
     for(int i=0; i<b.length; i++){
    	  
    	  if(b[i]!=0)
    	  b[count++]=b[i];
    	 }
     
     
     while(count<b.length){
    	 b[count++]=0;
     }
        	
    for(int i=0; i<b.length; i++){
    	  
    	 System.out.print(b[i]);
      }
     
   }
	


}
