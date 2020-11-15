package BOJ_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14656 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] student = new int[n];
		int count = 0;
		
		for(int i=0; i<n; i++) {
			
			student[i] = Integer.parseInt(st.nextToken());
			if(student[i] != i+1) {
				count++;
			}
			
		}
		
		System.out.println(count);
		br.close();
		
	}
}