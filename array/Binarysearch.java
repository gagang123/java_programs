package Array;

public class Binarysearch{

	   public static void main (String args[])
		{
			int arr[] = { 1, 1, 1, 2, 3, 3, 5, 5,8, 8, 8, 9, 9, 10 };
			int Start = 0;
			int End = arr.length-1;
			int item = 5;
			int index = -1;
			while(End>Start)
			{
				
				int mid = ((Start+End)/2);
				if (item<arr[mid])
				{
					End= mid-1;
					
				}
				else if (item>arr[mid])
				{
					Start = mid+1;
				}
				
				else {
					index= mid;
					break;	
				}
				
			}
				
				System.out.println(index);		
			}
			
				
	     }
