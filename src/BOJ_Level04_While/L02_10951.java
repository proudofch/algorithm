package BOJ_Level04_While;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class L02_10951 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = br.readLine();
		
		while( input != null ) {
			
			String[] basket = input.split(" ");
			
			int a = Integer.parseInt(basket[0]);
			int b = Integer.parseInt(basket[1]);
			int sum = a + b;
			bw.write(String.valueOf(sum)+"\n"); //String.valueOf: 어떤 값이라도 문자열로 바꿔준다.
												//BufferedWriter로 int값을 write하고 싶다면 무조건 문자열로 바꿔줘야 하는 듯
			bw.flush(); //여기서 flush를 해야 sum이 바로 출력. while문 밖의 close는 반복문 종료 시 한꺼번에 출력하게 만듦 
			input = br.readLine();
			
		}
		
		bw.close();
		br.close();
		
	}
}
