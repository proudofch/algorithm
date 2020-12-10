package BOJ_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_02355 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		int count = 0;
		
		long answer = 0;
		
		if (a < b) {
			for(long i=a; i<=b; i++) {
				count++;
			}
			answer = count * (a+b)/2; 
		} else {
			for(long i=b; i<=a; i++) {
				count++;
			}
			answer = count * (a+b)/2;
		}
		
		System.out.println(answer);
		
		br.close();
		
	}
}
