package BOJ_Level07_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class L06_01152 {
	public static void main(String[] args) throws IOException {

		// 공백을 입력했을 때 0이 출력되어야 한다. 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sentence = br.readLine().trim();
		StringTokenizer st = new StringTokenizer(sentence, " ");
		System.out.println(st.countTokens());
		br.close();
		
	}
}
