package BOJ_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_02845 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int l = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		int numberOfPeople = l * p;
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<5; i++) {
			int participants = Integer.parseInt(st.nextToken());
			sb.append(participants - numberOfPeople + " ");
		}
		
		System.out.println(sb.toString());
		br.close();
		
	}
}