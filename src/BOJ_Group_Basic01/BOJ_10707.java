package BOJ_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10707 {
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		int a = Integer.parseInt(br.readLine()); // X사의 1리터당 요금
		int b = Integer.parseInt(br.readLine()); // Y사의 기본 요금
		int c = Integer.parseInt(br.readLine()); // Y사의 기본 요금이 되는 사용량 상한
		int d = Integer.parseInt(br.readLine()); // Y사의 1리터당 추가 요금
		int p = Integer.parseInt(br.readLine()); // 수도 사용량
		
		int ratesOfX = a * p;
		int ratesOfY = (p <= c) ? b : b + (p-c)*d;
		int answer = (ratesOfX > ratesOfY) ? ratesOfY : ratesOfX;
		
		System.out.println(answer);
		
		br.close();
		
	}
}
