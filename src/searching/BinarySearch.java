package searching;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8};
		System.out.println(binarySearch(arr,8));
		System.out.println(binarySearchRecursion(arr,8,0,(arr.length)-1));

	}

	private static Boolean binarySearch(int[] arr, int val) {
		
		int low=0;
		int high=arr.length-1;
		
		
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==val)
				return true;
			else if(arr[mid]>val) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		
		return false;
		
	}
	
	
	private static Boolean binarySearchRecursion(int[] arr,int target, int left, int right) {
		if(right<left)
			return false;
		int mid=(left+right)/2;
		
		if(arr[mid]==target)
			return true;
		
		if(arr[mid]>target) {
			right=mid-1;
			return binarySearchRecursion(arr,target,left,right);
		}else {
			left=mid+1;
			return binarySearchRecursion(arr,target,left,right);
		}
	}

}
