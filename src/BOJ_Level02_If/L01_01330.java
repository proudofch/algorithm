package BOJ_Level02_If;

import java.util.Scanner;

public class L01_01330 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(a > b) {
			System.out.println(">");
		}
		else if(a < b) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
	}
}
