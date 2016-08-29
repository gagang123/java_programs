package general;

public class vowels {

	public static void main(String[] args) {
		

		String s="gaaeigaiin";
		
		String vow="";

        for(int i=0; i<s.length(); i++){
            
            if(s.charAt(i)=='a')
            	vow+="a";
            else if(s.charAt(i)=='e')
            	vow+="e";
            else if(s.charAt(i)=='i')
            	vow+="i";
            else if(s.charAt(i)=='o')
            	vow+="o";
            else if(s.charAt(i)=='u')
            	vow+="u";
           // else
            	//vow+=s.charAt(i);
        }
        System.out.println(vow);
        
        String reverse="";
        for ( int i = vow.length() - 1 ; i >= 0 ; i-- )
            reverse = reverse + vow.charAt(i);
            System.out.println(reverse);
        
	}

}
