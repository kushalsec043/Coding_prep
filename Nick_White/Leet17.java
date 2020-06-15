package Nick_White;

public class Leet17 
{
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,5,66,77,88};
		
		System.out.println(arr[binary_search(arr, 0, arr.length-1, 1)]);
		
	}
    
	public static int binary_search(int arr[], int left, int right, int k)
	{
		int index = -1;
		
		while(left <= right)
		{
			int mid = (left + right)/2;
			
			if(k < arr[mid])
			{
				right = mid - 1;
			}
			else if(k > arr[mid])
			{
				left = mid + 1;
			}
			else
			{
				return mid;
			}
		}
		return index;
	}
}
