package DP;

public class dup_arr {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,1};
		
		for(int i=0; i<arr.length;i++){
			//System.out.println(arr[Math.abs(arr[i])]);
			
			if(arr[Math.abs(arr[i])] > 0)
				
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			else
				System.out.print(Math.abs(arr[i]));
					
			
		}	
	}
}
