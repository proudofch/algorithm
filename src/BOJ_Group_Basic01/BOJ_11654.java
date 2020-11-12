package BOJ_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11654 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char answer = br.readLine().charAt(0); //어차피 한 글자만 입력되므로 charAt(0)를 써서 String을 char로 바꾼다
		System.out.println((int)answer); //char를 int로 형변환해야 아스키코드값 나옴!!
		br.close();
		
	}
}
