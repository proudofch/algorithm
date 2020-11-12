package Backjoon_Level04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class L01_10952 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] input = br.readLine().split(" ");
		
		while(!input[0].equals("0") && !input[1].equals("0")) {
			
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			int sum = a + b;
			bw.write(String.valueOf(sum)+"\n"); //String.valueOf: 어떤 값이라도 문자열로 바꿔준다.
												//BufferedWriter로 int값을 write하고 싶다면 무조건 문자열로 바꿔줘야 하는 듯
												//개행문자 더하면 어차피 문자열이라, 중복된 경향 있음
			input = br.readLine().split(" ");
		}
		
		bw.close();
		br.close();
		
	}
}
