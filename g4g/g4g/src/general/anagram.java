package general;

import java.util.HashMap;
import java.util.Map;

public class anagram {

	public static void main(String[] args) {
      
		char[] ch = new char[26];
	    anagram a= new anagram();
	    System.out.println(a.isAnagram("aab","baa")); 
		
		
		}
	
	 public boolean isAnagram(String s, String t) {
	        
		 Map<Character, Integer> charmap= new HashMap<Character, Integer>();
		 
		 for(char ch: s.toCharArray()){
			 if(charmap.containsKey(ch))
				 charmap.put(ch, charmap.get(ch)+1);
			 else
				 charmap.put(ch, 1);
				 
		 }
		 
		 for(char ch: t.toCharArray()){
			 if(!charmap.containsKey(ch))
				 return false;
			 if(charmap.get(ch)==1)
				 charmap.remove(ch);
			 else
				 charmap.put(ch, charmap.get(ch)-1);
			 
		 }
		 
		 if(charmap.keySet().size()==0)
			 return true;
		
	       
	  return false;
	    }
}
