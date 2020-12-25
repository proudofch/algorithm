package BOJ_Level01_Input;

import java.util.Scanner;

public class L11_02588 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		String[] b = scan.next().split("");
		
		int third = Integer.parseInt(b[2]);
		int fourth = Integer.parseInt(b[1]);
		int fifth = Integer.parseInt(b[0]);
		int sixth = Integer.parseInt(b[0]+b[1]+b[2]);
		
		System.out.println(a * third);
		System.out.println(a * fourth);
		System.out.println(a * fifth);
		System.out.println(a * sixth);
		
	}
}
