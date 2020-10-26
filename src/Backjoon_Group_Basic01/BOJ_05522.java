package Backjoon_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_05522 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int sum = 0;
		
		for(int i=0; i<5; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			sum += Integer.parseInt(st.nextToken());
		}
		
		System.out.println(sum);
		br.close();
		
	}
}