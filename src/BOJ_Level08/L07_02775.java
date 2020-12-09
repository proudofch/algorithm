package BOJ_Level08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2차원배열은 떠올리지도 못했다..

public class L07_02775 {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
		
			/* 이 사람의 코드
			 * https://st-lab.tistory.com/78 */
			
			int[][] apartment = new int[15][15];
			
			for(int i=0; i<15; i++) {
				apartment[i][1] = 1; // 1호는 다 1이다.
				apartment[0][i] = i; // 0층 i호에는 i명이 있다. 
			}
			
			// 0층 i호와 x층 1호의 인원은 위에서 채웠고, 나머지를 채울 차례
			for(int i=1; i<=14; i++) { // 1층부터 14층까지 
				for(int j=2; j<=14; j++) { // 2호부터 14호까지
					apartment[i][j] = apartment[i][j-1] + apartment[i-1][j];
									// i층 직전 호 + j호의 아래층의 합
				}
			}
			
			int t = Integer.parseInt(br.readLine());
			StringBuilder sb = new StringBuilder();
			
			for(int i=0; i<t; i++) {
				int k = Integer.parseInt(br.readLine()); // 층
				int n = Integer.parseInt(br.readLine()); // 호
				sb.append(apartment[k][n]+"\n");
			}
			
			System.out.println(sb.toString());
			
			br.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
