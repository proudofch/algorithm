package BOJ_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10101 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		String answer = "";
		
		if(a+b+c == 180) {
			
			if(a==b && b==c && a==c) { // Equilateral을 먼저 판별해주지 않으면 오답 나옴
				answer = "Equilateral";
			} else if(a==b || b==c || a==c) {
				answer = "Isosceles";
			} else if(a!=b || b!=c || a!=c) {
				answer = "Scalene";
			}
			
		} else {
			answer = "Error";
		}
		
		System.out.println(answer);
		
		br.close();
		
		/*  정답자 중 HashSet을 사용한 사람이 있었다.
			HashSet은 중복을 허용하지 않으므로, size==2일 경우 중복이 1개 있었단 소리이므로.. 이를 활용해서 풀이	*/
		
	}
}
