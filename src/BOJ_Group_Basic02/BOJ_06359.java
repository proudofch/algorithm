package BOJ_Group_Basic02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_06359 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			
			int numberOfRoom = Integer.parseInt(br.readLine());
			int[] room = new int[numberOfRoom+1];
			
			for(int j=2; j<=numberOfRoom; j++) {
				int x = j; // j값을 직접적으로 바꾸면 for문이 순차적으로 돌지 않는다.
				while(x <= numberOfRoom) {
					if(room[x] == 1) { // boolean 타입 배열을 만들었으면 이 if-else문 대신 ! 쓰면 됐는데..
						room[x] = 0;
					} else {
						room[x] = 1;
					}
					x += j;
				}
			}
			
			int count = 0;
			
			for(int k=0; k<room.length; k++) {
				if(room[k] == 0) {
					count++;
				}
			}
			sb.append((count-1)+"\n"); // 0번방을 제외하기 위해 -1
			
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
