package BOJ_Level07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class L07_02908 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String a = st.nextToken();
		String b = st.nextToken();
		
		String ans1 = "";
		String ans2 = "";
		
		for(int i=a.length()-1; i>=0; i--) {
			ans1 += a.charAt(i);
			ans2 += b.charAt(i);
		}
		
		int A = Integer.parseInt(ans1);
		int B = Integer.parseInt(ans2);
		
		int answer = (A > B) ? A : B;
		System.out.println(answer);
		
		br.close();
	}
}
