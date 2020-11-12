package Backjoon_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_05596 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] a = new int[4];
		int[] b = new int[4];
		
		for(int i=0; i<4; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<4; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		int a_sum = 0;
		int b_sum = 0;
		
		for(int i=0; i<4; i++) {
			a_sum += a[i];
			b_sum += b[i];
		}
		
		int answer;
		if(a_sum == b_sum) {
			answer = a_sum;
		}
		
		answer = a_sum > b_sum ? a_sum : b_sum;
		
		System.out.println(answer);
		br.close();
		
	}
}
