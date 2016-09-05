package Array;

public class subsequence {

	public static void main(String[] args) {
		
		
		
		String s = "rww", t = "ahbgdc";
		
		System.out.println(seq(s,t));
		      
			        
					

	}

	private static boolean seq(String s, String t) {
		       if(s=="")
		        return true;
		        
		        if(t=="")
		        return false;
		        
		        int j=0;
				for(int i=0; i<t.length(); i++){
					
					if(t.charAt(i)==s.charAt(j))
						j++;
					if(j==s.length())
				     	return true;
				
				}
					
				

					return false;
		
	}

}
