package Backjoon_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_10817 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] array = new int[3];
		
		for(int i=0; i<array.length; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(array);
		System.out.println(array[1]);
		
		/* 직접 정렬해도 시간은 똑같다
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		if( a >= b ) {
			if(a >= c) {
				if(b > c) {
					answer = b;
				} else {
					answer = c;
				}
			} else {
				answer = a;
			}
		} else {
			if(b >= c) {
				if(a >= c) {
					answer = a;
				} else {
					answer = c;
				}
			} else {
				answer = b;
			}
		}
		*/
		br.close();
	}
}
