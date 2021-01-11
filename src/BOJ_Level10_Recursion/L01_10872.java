package BOJ_Level10_Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L01_10872 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 0<=n<=12
		
		L01_10872 problem = new L01_10872();
		long answer = problem.factorial(n);
		System.out.println(answer);
		
		br.close();
		
	}
	
	public long factorial(long x) {
		if(x == 1 || x == 0) {
			return 1;
		} else {
			return x * factorial(x-1);
		}
	}
	
}
