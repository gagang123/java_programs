package g4g;

public class inc_dec {
	public static void main(String args[]){
	int arr[] = {8, 10, 20, 80, 100, 200, 400, 500, 3, 2, 1};
	
	  //linear(arr);
	  binary(arr);
	
	}
	
	public static void linear(int [] arr){
	int max= arr[0];
	int loc=0;
	
	for(int i=0; i<arr.length; i++)
		if(max < arr[i]){
			max=arr[i];
          	loc=i;
          	}
	    System.out.println(loc);			
	}
	
    public static void binary(int [] arr){
    	
    	int low=0;
    	int high= arr.length-1;
    	
    	
    	func(arr,low,high);
 
		
	}

    public static void func(int arr[], int low, int high )
    {
    	int mid= (high+low)/2;
    	
    	if (low == high)
        	System.out.println(low);
        	
        if ( arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1])
        	      System.out.println(mid); 
        	
        if(arr[mid]>arr[mid+1] && arr[mid]<arr[mid-1])
        		func(arr,low,mid-1 );
        if(arr[mid]<arr[mid+1] && arr[mid]>arr[mid-1])
        		func (arr, mid+1,high);
    }

}
