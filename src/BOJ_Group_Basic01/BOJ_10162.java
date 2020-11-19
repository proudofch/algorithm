package BOJ_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10162 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = 300;
		int B = 60;
		int C = 10;
		
		int buttonA = 0;
		int buttonB = 0;
		int buttonC = 0;
		
		int T = Integer.parseInt(br.readLine());
		
		if(T % 10 != 0) { // 3개의 버튼으로 시간을 정확히 맞출 수 없는 경우 -1 출력
			System.out.println(-1);
			
		} else {
			
			while(T != 0) {
				
				if(T-A >= 0) {
					T -= A;
					buttonA++;
				} else {
					if(T-B >= 0) {
						T -= B;
						buttonB++;
					} else {
						T -= C;
						buttonC++;
					}
				}
				
			} // /.while
			
			System.out.println(buttonA + " " + buttonB + " " + buttonC);
		}
		// 결국 버튼이 눌리는 횟수는 T/Button이므로, 이를 활용해서 풀어도 됨
		
		br.close();
		
	}
}
