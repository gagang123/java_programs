package g4g;

public class segregate {

	public static void main(String[] args) {
		int [] arr={0,0,0,1,1,0,1,0,1,0,0,1};
		seg(arr);
		/*int count=0;
		for(int i=0; i<arr.length;i++){
			if(arr[i]==0)
			count++;
		}
		System.out.println(count);
		
		for(int i=0;i<arr.length;i++){
			if(i<count)
				arr[i]=0;
			else
				arr[i]=1;
		System.out.print(arr[i]);		
			}*/
		

	}
	
	public static void seg(int []arr){
		
		int l,h;
		l=0;
		h=(arr.length)-1;
		while(l<=h)
		{
		   if(arr[l]==0)
              l++;
	       else{
	           	arr[l]=0;
	           	arr[h]=1;
		        h--;
	          }
		}
		for(int i=0; i<arr.length;i++)
			System.out.print(arr[i]);
		
	}

}
