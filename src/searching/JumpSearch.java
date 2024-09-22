package searching;

public class JumpSearch {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8};
		
		System.out.println(jumpSearch(arr,8));

	}

	private static Boolean jumpSearch(int[] arr, int target) {
		
		int blockSize=(int) Math.sqrt(arr.length);
		System.out.println("Block Size :"+blockSize);
		int start=0;
		int last=blockSize-1;		
		
		while(arr[last] < target && start < arr.length) {
			start=last+1;
			last=last+blockSize;
			if(last>arr.length-1) {
				last=arr.length-1;
			}
		}
		
		for(int i=start;i<=last;i++) {
			if(arr[i]==target) {
				return true;
			}
		}
		return false;
	}

}
