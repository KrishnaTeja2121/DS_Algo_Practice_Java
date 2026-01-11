package Arrays;

public class MaxSumSubarray {

	public static void main(String[] args) {
		int[] arr= {10,2,6,25,4};
		int max_sum=0;
		int k=3;
		int n=arr.length;
		for(int i=0;i<(n-k)+1;i++) {
			int local_sum=0;
			for(int j=i;j<i+k;j++) {
				int end=i+k;
				local_sum+=arr[j];
			}
			System.out.println("local_sum: "+local_sum);
			if(local_sum > max_sum) {
				max_sum=local_sum;
			}
			System.out.println("max_sum: "+max_sum);
		}
		System.out.println("max_sum: "+max_sum);
		

 	}

}
