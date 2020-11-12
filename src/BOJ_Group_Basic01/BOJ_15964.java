package BOJ_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Calculator {
	
	private long a;
	private long b;
	
	public Calculator(long a, long b) {
		this.a = a;
		this.b = b;
	}
	
	long cal(long a, long b) {
		return (this.a + this.b) * (this.a - this.b);
	}
	
}

public class BOJ_15964 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		// int answer = (a+b)*(a-b); // 이렇게 제출하니까 30점
		
		// 이 문제도 a,b가 최대 100,000이기 때문에 long으로 casting
		long c = (long)a;
		long d = (long)b;
		
		Calculator cal = new Calculator(c, d);
		System.out.println(cal.cal(c, d));
		
		br.close();
		
	}
	
}