package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class SparseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N  = scan.nextInt();
        scan.nextLine(); // gets rid of pesky newline
        
        /* Create and fill HashMap */
        HashMap<String, Integer> map  = new HashMap();
        
        for (int i = 0; i < N; i++) {
            String str = scan.nextLine();
            map.merge(str, 1, Integer::sum);
        }
        
        /* Query HashMap */
        int Q = scan.nextInt();
        scan.nextLine(); // gets rid of pesky newline
        for (int i = 0; i < Q; i++) {
            String str = scan.nextLine();
            System.out.println(map.getOrDefault(str, 0));
        }     
        
	}

}
