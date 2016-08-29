package g4g;

public class move {
	public static void main(String args[]){
		
		int[] arr={21,2,13,4,5,6,7,8,9};
		max_from_right(arr);
		
	}

	public static void max_from_right(int[] arr){
		
		int max= arr[arr.length-1];
		System.out.print(max);
		
		for(int i=arr.length-2;i>=0;i--){
			
			if(max <= arr[i]){
				
				System.out.print("  "+arr[i]);
				max=arr[i];
			}
		}
		
		
		
	}
}
