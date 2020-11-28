package BOJ_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_15873 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		int answer = 0;
		int zero = input.indexOf("0");
		
		if(zero != -1) {
			
			if(input.length() == 4) { // 1010의 경우 (처음에 이걸 막지 못해서 틀렸다)
				answer = 20;
			} else {
				if(zero == 1) { // 10+a인 경우
					answer = (input.charAt(2)-'0') + 10;
				} else { // a+10인 경우
					answer = (input.charAt(0)-'0') + 10;
				}
			}
			
		} else { // 한 자리 수 + 한 자리 수의 경우
			answer = (input.charAt(0)-'0') + (input.charAt(1)-'0');
		}
		
		System.out.println(answer);
		
		br.close();
		
	}
}
