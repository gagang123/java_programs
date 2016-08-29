package general;

import java.util.Scanner;

public class spaces {

	public static void main(String[] args) {
		String s= "I am gagan garg";

		/*Scanner in= new Scanner(System.in);
		String s1= in.next();
		for(int i=0; i<s1.length();i++){
			
			if(s1.contains(" ")){
				s1.replace(" ", "%20");
				
			}			
		}*/
		
		char[] c1=s.toCharArray();
		int spacecount=0;
		for(int i=0; i<c1.length; i++){
			if(c1[i]==' ')
               spacecount++;		
		}
		
		int newlength= c1.length+2*spacecount;
		
		char[] c2= new char[newlength];
		
		for(int i=0; i<c1.length; i++){
			if(c1[i]== ' '){
				
				c2[i]='%';
				c2[i+1]='2';
				c2[i+2]='0';
			}
			else{
				//c2[]=c1[i];
				
			}
			
			
			
		}

	}

}
