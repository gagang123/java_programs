package general;

import java.awt.List;
import java.util.Arrays;
import java.util.Scanner;

public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
        int a[][]= new int[3][3];
        for(int i=0; i < 3; i++){
            for(int j=0; j < 3; j++){
                  a[i][j] = in.nextInt();
            }
        }
         for(int i=0; i < 3; i++){
            for(int j=0; j < 3; j++){
                  System.out.print(a[i][j]+" ");
            }
             System.out.println();
        }  
         int b[]= new int[9];
         for(int i=0; i<9; i++){
        	 b[i]=i+1;
        	 
         }
         for(int i=0; i<9; i++){
        	 System.out.print(b[i]);
        	 
         }
         
      //   List<String> array1AsList = Arrays.asList(b);
         
	}

}
