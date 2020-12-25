package BOJ_Level06_Function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Hansu {
	
	// 입력: 1~1000 사이
	// 1~99는 모두 등차수열이므로 세자리 수만 검증하면 됨
	
	void getHansu(int input) {
		
		int count = 0;
		
		if(1 <= input && input <= 99) { // 1~99의 각 수는 공차가 음수,0,양수인 등차수열이고 곧 한수이다.
			count = input;
			
		} else {
			
			count = 99;
			
			for(int i=100; i<=input; i++) {
				
				int one = i % 10; // 일의 자리
				int ten = (i / 10) % 10; // 십의 자리
				int hun = i / 100; //백의 자리
				
				if( (one-ten) == (ten-hun) ) {
					count++;
				}
			}
			
		}
		
		System.out.println(count);
		
	}
	
} // /.class Hansu


public class L03_01065 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Hansu h = new Hansu();
		h.getHansu(n);
		
		br.close();
		
	}
}