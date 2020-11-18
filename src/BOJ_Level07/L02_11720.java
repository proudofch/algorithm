package BOJ_Level07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L02_11720 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		String number = br.readLine(); // 여기서 toCharArray() 쓰면 바로 char[] 생성
		
		for(int i=0; i<n; i++) {
			sum += Integer.parseInt(String.valueOf(number.charAt(i)));
			// sum += number.charAt(i)-'0';
			// 위와 같이 해도 된다. 아스키코드표 상 '0'=80이고, '1'=81,'2'=82,.. 이렇게 수가 커지기 때문이다.
		}
		
		System.out.println(sum);
		
		br.close();
		
	}
}