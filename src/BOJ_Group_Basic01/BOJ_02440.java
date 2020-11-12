package BOJ_Group_Basic01;

import java.util.Scanner;

public class BOJ_02440 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int star = scanner.nextInt();
		
		for(int i=1; i<=star; i++) {
			for(int j=star; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}