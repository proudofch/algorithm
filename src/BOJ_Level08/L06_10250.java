package BOJ_Level08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class L06_10250 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			int floor = 0;
			int unit = 1;
			
			if(N <= H) {
				floor = N;
			} else {
				floor += N/W-1;
				unit += N%H;
			}
			
			String unitStr = "";
			String floorStr = String.valueOf(floor);
			
			if(unit < 10) {
				unitStr = "0"+String.valueOf(unit);
			} else {
				unitStr = String.valueOf(unit);
			}
			
			sb.append(floorStr + unitStr + "\n");
			
		}
		
		System.out.print(sb.toString());
		br.close();
		
	}
}
