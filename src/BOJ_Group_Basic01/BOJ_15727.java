package Backjoon_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_15727 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int distance = Integer.parseInt(br.readLine());
		int minutes = (distance % 5 != 0) ? distance/5 + 1 : distance/5;
			
		System.out.println(minutes);
		br.close();
		
	}
}