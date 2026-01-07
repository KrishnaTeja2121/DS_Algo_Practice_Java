package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSumTwoPointerSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1, 3, 5, 10, 12, 15};
		int target=15;
		int sol[]= twoSum(arr, target);
		
		System.out.println(Arrays.toString(sol));

	}
	
	public static int[] twoSum(int[] nums, int target) {
		
		int left=0, right=nums.length-1;
		
		while(left < right) {
			int sum= nums[left] + nums[right];
			if(sum==target) {
				return new int[] {left+1, right+1 };
			}else if(sum < target) {
				left++;
			}else {right--; }
		}
		
		return new int[] {-1, -1};
	}

}
