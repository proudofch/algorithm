package BOJ_Group_Basic02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_01357 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		String x = st.nextToken();
		String y = st.nextToken();
		
		String newX = sb.append(x).reverse().toString();
		sb.delete(0, 1000);
		String newY = sb.append(y).reverse().toString();
		sb.delete(0, 1000);
		
		int temp = Integer.parseInt(newX) + Integer.parseInt(newY);
		String ans = sb.append(String.valueOf(temp)).reverse().toString();
		int answer = Integer.parseInt(ans); // 105 994 입력 시 0001 리턴을 막기 위해 다시 한번 int형으로 바꿨다.

		System.out.println(answer);
		
		br.close();
		
	}
}
