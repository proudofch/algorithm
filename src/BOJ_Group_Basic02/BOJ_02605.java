package BOJ_Group_Basic02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_02605 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int numOfStudent = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		list.add(1);
		String discard = st.nextToken();
		
		// list size()-temp로 인덱스를 구하는 방법도 있다. 이러면 위의 discard 변수는 필요 없어짐.
		for(int i=1; i<numOfStudent; i++) {
			int temp = Integer.parseInt(st.nextToken());
			list.add(i-temp, i+1); // 원래 자리 i에서 앞으로 몇 칸 갈지를 빼준다.
		}
		
		for(int i : list) {
			sb.append(i).append(" ");
		}
		
		System.out.println(sb.toString());
		
		br.close();
		
	}
}
