package BOJ_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_17362 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int remainder = n % 8;
		
		if(remainder == 1) {
			System.out.println(1);
		} else if(remainder == 0 || remainder == 2) {
			System.out.println(2);
		} else if(remainder == 3 || remainder == 7) {
			System.out.println(3);
		} else if(remainder == 4 || remainder == 6) {
			System.out.println(4);
		} else {
			System.out.println(5);
		}
		
		br.close();
	}
}
