package BOJ_Group_Basic02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_01009 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			double x = Math.pow(a, b);
			double y = x % 10;
			int answer = 0;
			
			/*
			if(1 <= y && y <= 10) {
				answer = y;
			} else {
				
			}
			*/
			sb.append(x+"/"+y).append("\n");
			
		}
		
		System.out.println(sb.toString());
		br.close();
		
	}
}
