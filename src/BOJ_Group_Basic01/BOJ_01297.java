package BOJ_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_01297 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int diagonal = Integer.parseInt(st.nextToken()); 
		int H = Integer.parseInt(st.nextToken()); 
		int W = Integer.parseInt(st.nextToken());
		
		/* 비율이 9:16으로 주어졌을 때 > 높이=9a, 너비=16a
		 * (9a)^2 + (16a)^2 = diagonal^2
		 * 9^2*a^2 + 16^2*a^2 = diagonal^2 (위 식의 제곱을 푼 것)
		 * a^2 = diagonal^2 / (9^2+16^2)
		 * Math.sqrt로 a의 제곱근을 구하는 것(루트 씌우기) */
		
		double a = Math.sqrt(Math.pow(diagonal,2) / (Math.pow(H,2) + Math.pow(W,2)));
		
		double height = Math.floor(a * H);
		double width = Math.floor(a * W);
		
		System.out.println((int)height + " " + (int)width);
		
		br.close();
		
	}
}
