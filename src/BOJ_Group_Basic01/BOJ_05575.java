package BOJ_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_05575 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<3; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int h1 = Integer.parseInt(st.nextToken());
			int m1 = Integer.parseInt(st.nextToken());
			int s1 = Integer.parseInt(st.nextToken());
			int totalSeconds1 = (h1*60*60) + (m1*60) + s1;
			
			int h2 = Integer.parseInt(st.nextToken());
			int m2 = Integer.parseInt(st.nextToken());
			int s2 = Integer.parseInt(st.nextToken());
			int totalSeconds2 = (h2*60*60) + (m2*60) + s2;
			
			// 그냥 3600 써도 됐을 듯
			int workTime = totalSeconds2 - totalSeconds1;
			int workHour = (workTime/60)/60;
			int workMinutes = (workTime/60)%60;
			int workSeconds = workTime%60;
			
			sb.append(workHour + " " + workMinutes + " " + workSeconds + "\n");

		}
		
		System.out.println(sb.toString());
		
		br.close();
		
	}
}
