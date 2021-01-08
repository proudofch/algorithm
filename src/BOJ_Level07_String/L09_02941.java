package BOJ_Level07_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class L09_02941 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int count = 0;
		
		/* 문자열 확인할 때 split하지 말고 charAt을 잘 써보자! */
		
		for(int i=0; i<input.length(); i++) {
			
			count++;
			char a = input.charAt(i);
			
			if(a == 'c') {
				if(i+1 < input.length()) { // 이 조건이 없으면 outOfRange 예외 발생
					if(input.charAt(i+1) == '=' || input.charAt(i+1) == '-') {
						i++;
					}
				}
				
			} else if(a == 'd') { // 이 조건에서 헤맬 때 반례는 'd-'였다. 1 나와야 되는데 2 나왔었다;
				if(i+1 < input.length()) {
					if(input.charAt(i+1) == 'z') {
						if(i+2 < input.length()) { // 분리하여 이 조건을 추가해주어야 정답 (2)
							if(input.charAt(i+2) == '=') { // 이 부분을 29줄에서 &&로 처리했더니 난리남; (1)
								i += 2;
							}
						}
					} else if(input.charAt(i+1) == '-') {
						i++;
					}
				}
				
			} else if(a == 'l' || a == 'n') {
				if(i+1 < input.length()) {
					if(input.charAt(i+1) == 'j') {
						i++;
					}
				}
				
			} else if(a == 's' || a == 'z') {
				if(i+1 < input.length()) {
					if(input.charAt(i+1) == '=') {
						i++;
					}
				}
			}
			
		}
		
		System.out.println(count);
		
		br.close();
		 
	}
}
