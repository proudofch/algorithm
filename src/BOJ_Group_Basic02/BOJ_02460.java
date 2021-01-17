package BOJ_Group_Basic02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_02460 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int numberOfPeople = 0;
		int max = -1;
		
		for(int i = 0; i < 10; i++) {
			
			st = new StringTokenizer(br.readLine());
			int getOff = Integer.parseInt(st.nextToken());
			int getOn = Integer.parseInt(st.nextToken());
			
			numberOfPeople -= getOff;
			numberOfPeople += getOn;
			
			max = Math.max(max, numberOfPeople);
			
		}
		
		System.out.println(max);
		
		br.close();
		
	}
}
