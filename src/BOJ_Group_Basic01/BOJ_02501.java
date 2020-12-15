package BOJ_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_02501 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); // 약수를 구해야 할 수 n (1<=n<=10000)
		int k = Integer.parseInt(st.nextToken()); // k번째로 작은 수(약수 개수가 k보다 작아서 없을 경우 0 리턴)
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=1; i<=n; i++) {
			if(n % i == 0) {
				list.add(i);
			}
		}
		
		int answer = -1;
		
		if(list.size() < k) {
			answer = 0;
		} else {
			answer = list.get(k-1);
		}
		
		System.out.println(answer);
		
		br.close();
		
	}
}
