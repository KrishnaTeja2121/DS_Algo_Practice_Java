package _50CodingQuestionsHackerRank;

import java.util.Scanner;

public class RightAngledTrianglePattern {

	public static void main(String[] args) {
		System.out.println("Enter the size\n");
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
