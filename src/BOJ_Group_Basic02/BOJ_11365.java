package BOJ_Group_Basic02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11365 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringBuilder sb = new StringBuilder(); // StringBuilder의 reverse()를 이용하는 방법도 있다.
		
		while(!input.equals("END")) { // true로 돌리고 END에서 break 주는 방법도 있다.
			
			for(int i=input.length()-1; i>=0; i--) {
				sb.append(input.charAt(i));
			}
			sb.append("\n");
			input = br.readLine();
			
		}
		
		System.out.println(sb.toString());
		
		br.close();
		
	}
}
