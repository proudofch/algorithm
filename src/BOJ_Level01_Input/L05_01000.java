package BOJ_Level01_Input;

import java.util.Scanner;

public class L05_01000 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split(" ");
		System.out.println(Integer.parseInt(input[0]) + Integer.parseInt(input[1]));
		scan.close();
	}
}
