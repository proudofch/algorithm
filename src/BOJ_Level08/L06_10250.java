package BOJ_Level08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class L06_10250 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int H = Integer.parseInt(st.nextToken()); // 높이
			int W = Integer.parseInt(st.nextToken()); // 너비
			int N = Integer.parseInt(st.nextToken()); // N번째 손님
			
			int floor = 1;
			int unit = 1;
			
			/* 처음 조건문을 N%H==0으로 걸어도 된다 */
			if(N <= H) { // 이때는 다 1호이다.
				floor = N;
			} else { 
				if(N % H == 0) {
					floor = H;
					unit = N/H;
				} else {
					floor = N%H;
					unit += N/H;
				}
			}
			
			String unitStr = "";
			String floorStr = String.valueOf(floor);
			
			if(unit < 10) {
				unitStr = "0"+String.valueOf(unit);
			} else {
				unitStr = String.valueOf(unit);
			}
			
			sb.append(floorStr + unitStr + "\n");
			
		}
		
		System.out.print(sb.toString());
		
		br.close();
		
	}
}
