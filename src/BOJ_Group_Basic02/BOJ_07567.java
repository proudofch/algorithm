package BOJ_Group_Basic02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_07567 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int count = 0;
		
		for(int i = 0; i < input.length(); i++) {
			if(i == 0) {
				count += 10;
				continue;
			} else {
				if(i < input.length() - 1) {
					if(input.charAt(i) == '(' && input.charAt(i+1) == '(') {
						count += 5;
					} else {
						count += 10;
					}
				}
			}
		}
		
		System.out.println(count);
		
		br.close();
		
	}
}
