package BOJ_Level03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L03_08393 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(buffer.readLine());
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
	}
}
