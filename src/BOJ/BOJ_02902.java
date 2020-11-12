package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_02902 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), "-");
		StringBuilder sb = new StringBuilder();
		
		while(st.hasMoreTokens()) {
			sb.append(st.nextToken().substring(0, 1));			
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
