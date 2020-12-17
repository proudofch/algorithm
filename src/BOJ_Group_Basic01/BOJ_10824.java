package BOJ_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10824 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String a = st.nextToken() + st.nextToken();
		String b = st.nextToken() + st.nextToken();
		long answer = Long.parseLong(a) + Long.parseLong(b);
		System.out.println(answer);
		
		br.close();
		
	}
}
