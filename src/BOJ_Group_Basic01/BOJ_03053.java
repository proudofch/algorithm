package BOJ_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_03053 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int r = Integer.parseInt(br.readLine());
		
		double circle = Math.PI * Math.pow(r,2); // 유클리드 기하학의 원의 넓이: r^2*PI
		double taxi = 2 * Math.pow(r, 2); // 택시 기하학의 원의 넓이: 2*R^2
		
		/* 참고 
		 * https://blog.naver.com/alwaysneoi/100172516753
		 * https://itholic.github.io/kata-taxicab-circle */
		
		String circleStr = String.format("%.6f", circle);
		String taxiStr = String.format("%.6f", taxi);
		
		System.out.println(circleStr);
		System.out.println(taxiStr);
		
		br.close();
		
	}
}
