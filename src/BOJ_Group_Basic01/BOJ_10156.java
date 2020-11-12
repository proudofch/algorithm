package BOJ_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10156 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int k = Integer.parseInt(st.nextToken()); //과자 1개의 가격
		int n = Integer.parseInt(st.nextToken()); //사려고 하는 과자의 개수
		int m = Integer.parseInt(st.nextToken()); //현재 가진 돈
		
		if(k*n <= m) {
			System.out.println(0);
		} else {
			System.out.println(k*n-m);
		}
		
		br.close();
		
	}
}