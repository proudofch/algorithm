package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_01436 {
	public static void main(String[] args) throws IOException {
		
		// "666"의 앞뒤로 숫자를 붙여 증감하여 풀어보려고 했으나 실패해서... 다른 사람 풀이
		// @author: https://fbtmdwhd33.tistory.com/20
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		int num = 0;
		while(N > 0) { // N이 0이 되면 종료. 666이 포함된 숫자를 N개까지 다 찾았다는 뜻
			num++;
			if(String.valueOf(num).contains("666")) {
				N--; // 666이 포함된 숫자를 하나 찾을 때마다 N을 빼주면 결국 N번째의 num이 답이 된다.
			}
		}
		
		System.out.println(num);
		
	}
}
