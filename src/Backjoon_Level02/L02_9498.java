package Backjoon_Level02;

import java.util.Scanner;

public class L02_9498 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();

		String answer = 
				(score >= 90 && score <= 100) ? "A" : 
					(score >= 80 && score <= 89) ? "B" : 
						(score >= 70 && score <= 79) ? "C": 
							(score >= 60 && score <= 69) ? "D" : "F";
		
		System.out.println(answer);
	}
}
