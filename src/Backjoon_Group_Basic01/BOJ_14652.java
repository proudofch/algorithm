package Backjoon_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14652 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int temp = 0;
		
		/*	
			2차원 배열을 만들고 temp값을 할당한 뒤 탐색하려니 메모리 초과남
			-> for문을 너무 많이 도나? 싶어서 Loop, break를 썼는데 똑같음
			-> n,m에 30,000을 넣으니 바로 터짐
			-> 배열 만들지 말고 그냥 탐색으로 변경
		*/
		
		Loop: for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(temp == k) {
					System.out.println(i+" "+j);
					break Loop;
				}
				temp++;
			}
		}
		
		/*	다른 풀이: k/m과 k%m (..) */
		
		br.close();
	}
}