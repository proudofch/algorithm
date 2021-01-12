package BOJ_Level10_Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L02_10870 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 0<=n<=20
		
		L02_10870 main = new L02_10870();
		System.out.println(main.fibonacciNumber(n));
		
		br.close();
		
	}
	
	public int fibonacciNumber(int x) {
		
		if(x <= 1) { // 처음에 0과 1이 있어야 두 수를 더할 수 있으니까
			return x;
		} else {
			return fibonacciNumber(x-1) + fibonacciNumber(x-2);
		}
		
	}
	
}
