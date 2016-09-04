package Array;

public class vowels {
	
	public static void main(String[] args){
		
		
		String s="leetcode";
		
		
		int i =0; 
		int j=s.length()-1;
		char [] charArray = s.toCharArray(); 
		while(j>i) {
			if(isVowel(charArray[i]))
				j--;
			else if (isVowel(charArray[j]))
				i++;
			swap(charArray, i, j);
				
			i++;j--;
			
				
		}
		System.out.println(new String (charArray)); 
	}

	private static void swap(char[] charArray, int i, int j) {
		// TODO Auto-generated method stub
		char temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		
	}

	private static boolean isVowel(char ch) {
		if(ch == 'a' || ch == 'e'||ch == 'i' || ch == 'o' || ch =='u') {
			return true;
		}
		return false;
	}
	
	

}
