package Practice;

public class Recursion_1 {
	
	static int[] arr= {12,43,87,9,0,3};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(SumofDigits(arr.length-1));
		System.out.println(fact(5));	
		System.out.println(fib(8));
	}

	private static int fib(int n) {
		if(n==0 || n==1)
			return n;

		return fib(n-1) + fib(n-2);
		
	}

	private static int fact(int n) {
		if(n==0)
			return 1;
		else {
			return n * fact(n-1);
		}
		
	}

	private static int SumofDigits(int n) {
		
		if(n==0) {
			return arr[n];
		}else {
			return arr[n] + SumofDigits(n-1);
		}
		
	}

}
