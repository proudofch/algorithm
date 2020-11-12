package Backjoon_Level05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class L07_04344 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int C = Integer.parseInt(br.readLine());
		
		for(int i=0; i<C; i++) {
			
			st = new StringTokenizer(br.readLine());

			int N = Integer.parseInt(st.nextToken());
			int sum = 0;
			int[] score = new int[N];
			
			for(int j=0; j<N; j++) {
				score[j] = Integer.parseInt(st.nextToken());
				sum += score[j];
			}
			
			int average = sum/N;
			int count = 0;
			
			for(int k=0; k<N; k++) {
				if(score[k] > average) {
					count++;
				}
			}
			
			float answer = (float)count/N*100;
			sb.append(String.format("%.3f", answer)+"%\n");
			
		}
		
		System.out.println(sb.toString());
		br.close();
		
	}
}