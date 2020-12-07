package BOJ_Level08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L02_02839 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		/*
			N = 3*x + 5*y 이고, 이때 x+y의 최소값을 구하는 게 문제이다. 이 식을 전개하면 x,y는 다음과 같다.
			x = (N-5y)/3
			y = (N-3x)/5
		*/
		
		int min = 10000;
		
		for(int x=0; x <= N/3; x++) { // x<=N/3인 이유는 3*(n/3)=n이라 n/3봉지 이상 쓸 수 없기 때문. 그리고 등호 없음 틀림;
			int y = (N-3*x) / 5;
			if((3*x) + (5*y) == N) {
				min = Math.min(min, x+y);
			}
		}
		
		if(min == 10000) {
			min = -1;
		}
		
		System.out.println(min);
		
		br.close();
		
	}
}
