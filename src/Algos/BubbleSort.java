package Algos;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr= {4,1,2,7,9,3};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}

	}

}
