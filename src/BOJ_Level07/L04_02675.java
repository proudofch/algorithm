package BOJ_Level07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class L04_02675 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		String[] array = new String[n];
		
		for(int i=0; i<n; i++) {
			
			st = new StringTokenizer(br.readLine());
			int loop = Integer.parseInt(st.nextToken());
			String word = st.nextToken();
			String answer = "";
			
			for(int j=0; j<word.length(); j++) {
				for(int k=0; k<loop; k++) {
					answer += word.charAt(j);
				}
			}
			
			array[i] = answer;
			answer = "";
			
		}
		
		for(String s : array) {
			System.out.println(s);
		}
		
		br.close();
		
	}
}
