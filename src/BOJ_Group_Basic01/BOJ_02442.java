package BOJ_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_02442 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		// StringBuilder에 append() 하는 방법도 있다.
		
		for(int i=1; i<=n; i++) {
			
			// 공백 찍기
			for(int j=i; j<n; j++) {
				System.out.print(" ");
			}
			
			// 별 찍기
			for(int k=1; k<=i*2-1; k++) { // 홀수 개의 별을 찍는다.
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		br.close();
		
	}
}
