package BOJ_Level11_BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class L01_02798 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); // 카드 개수
		int m = Integer.parseInt(st.nextToken()); // 최대값(기준)
		
		st = new StringTokenizer(br.readLine());
		
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < array.length; i++) { // 5개 중 3개를 뽑는다면 i의 범위를 0<=i<3으로 잡을 수도 있다.
			for(int j = i+1; j < array.length; j++) {
				for(int k = j+1; k < array.length; k++) {
					if(array[i] + array[j] + array[k] <= m) {
						int sum = array[i] + array[j] + array[k];
						list.add(sum);
					}
				}
			}
		}
		
		int max = -1;
		for(int i = 0; i < list.size(); i++) {
			max = Math.max(max, list.get(i));
		}
		
		System.out.println(max);

		br.close();
		
	}
}
