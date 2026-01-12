package Arrays;

public class PrefixSumRangeSumQuery {

	public static void main(String[] args) {
		int[] arr= {10,2,6,25,4};
		int n=arr.length;
		int pref_sum=0;
		
		int[] pref=new int[n];
		
		pref[0]=arr[0];
		
		for(int i=1;i<n;i++) {
			pref[i]=pref[i-1]+arr[i];
		}
		for(int j=0;j<pref.length;j++) {
			System.out.print(pref[j]+ " ");
		}
		System.out.println("");
		
		int left=1;
		int right=2;
		
		if(left==0) {
			pref_sum=pref[right];
			
		}else {
			pref_sum=pref[right]-pref[left-1];
		}
		
		System.out.println(pref_sum);
	}

}
