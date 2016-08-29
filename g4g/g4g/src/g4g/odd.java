package g4g;

public class odd {

	public static void main(String[] args) {
		int[] arr={2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2,5,2,1,2,1,8};
		
		//N_square_method(arr);
		//Xor_method(arr);
		hash_method(arr);
 
	}
	
	public static void N_square_method(int arr[]){
		int count=0,sum=0;
		for(int i=0; i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j])
					count++;
				}
			if(count%2!=0){
				System.out.println(arr[i]);
			    break;
			    
			}
		}
		System.out.println("No odd number found");
		
	}
	
	public static void Xor_method(int arr[]){
		int res=0;
		for(int i=0; i<arr.length;i++){
			res=res^arr[i];
			}
		System.out.println(res);
	}
	
	
	public static void hash_method(int arr[]){
		int[] map= new int[arr.length];
		for(int i=0; i<arr.length;i++){
			map[arr[i]]=arr[i];
			}
		
		}

}
