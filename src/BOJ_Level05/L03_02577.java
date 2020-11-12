package Backjoon_Level05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L03_02577 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int multiple = 1;
		
		for(int i=0; i<3; i++) {
			multiple *= Integer.parseInt(br.readLine()); 
		}
		// for문을 쓰지 않고 br.readLine()을 세 번 하여 multiple을 String으로 바꿔버리면 굳이 String[]을 만들 필요 없음
		// 그리고 split 대신 substring을 활용해 각 자리수 구하기
		
		String[] multiple_str = String.valueOf(multiple).split("");
		int[] array = new int[10];
		
		for(int i=0; i<multiple_str.length; i++) {
			int a = Integer.parseInt(multiple_str[i]);
			array[a]++;
		}
		
		for(int i : array) {
			System.out.println(i);
		}
		
		br.close();
		
	}
}