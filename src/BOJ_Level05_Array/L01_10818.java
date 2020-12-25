package BOJ_Level05_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class L01_10818 {
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		/* 내 풀이 > 1148ms */
		int[] array = new int[n];

		for(int i=0; i<array.length; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(array);
		
		System.out.println(array[0] + " " + array[array.length-1]);
		
		/* 버블 정렬하면 시간 초과남 */
		
		/* 다른 사람 풀이 > 452ms */
		/*
		int max = Integer.MIN_VALUE; // int형으로 표현할 수 있는 숫자 중 가장 작은 값으로 초기화
		int min = Integer.MAX_VALUE;
		
		while(st.hasMoreTokens()) {	
			int temp = Integer.parseInt(st.nextToken());
			max = Math.max(max, temp); // max엔 음수값이 들었으므로, 최초 1회에 temp가 max값으로 설정됨. 이후는 주어진 값 안에서 반복)
			min = Math.min(min, temp);
		}
		
		System.out.println(min + " " + max);
		*/
		
		br.close();
		
	}
}