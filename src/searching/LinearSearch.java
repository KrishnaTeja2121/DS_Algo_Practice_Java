package searching;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr= {7,8,1,2,3,9,0};
		System.out.println(search(arr,15));

	}

	private static int search(int[] arr, int val) {
		int index;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==val)
				return i;
		}return -1;
		
	}

}
