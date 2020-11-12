package Backjoon_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_02480 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int prize = 0;
		
		/*  나는 [3개 같은 경우 -> 3개 다른 경우 -> 2개 같은 경우]로 if문을 짰지만,
			[3개 같은 경우 -> 2개 같은 경우(3가지) -> 나머지]로 처리한 다른 사람의 코드가 시간상 더 유리했다.  */
		
		if(a == b && a == c && b == c) {
			prize = 10000 + (a*1000);
		} else if(a != b && a != c && b != c) {
			int max = Math.max(Math.max(a, b), c);
			prize = max*100;
		} else {
			if(a == b && b != c) {
				prize = 1000 + (a*100);
			} else if(b == c && a != b) {
				prize = 1000 + (b*100);
			} else if(a == c && a != b) {
				prize = 1000 + (c*100);
			}
		}
		
		System.out.println(prize);
		br.close();
		
	}
}