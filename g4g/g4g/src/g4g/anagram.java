package g4g;

public class anagram {

	public static void main(String[] args) {
		String s1="aaaabbb";
		String s2="aabbbaa";
		boolean FLAG=false;

		int i,j;
		i=s1.length();
		j=s2.length();

		if(i==j){
		for(int k=0;k<i;k++){
		for(int l=0;l<i;l++){
		if(s1.charAt(k)==s2.charAt(l)){
		FLAG=true;
		}
		else
	      FLAG=false;
		  
		}
	 }
  }
		if(FLAG)
		System.out.println("Given Strings are anagrams");
		else
		System.out.println("Given Strings are not anagrams");
		}
}


