package BOJ_Level11_BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class L02_02231 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int num = Integer.parseInt(input);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		// num의 생성자 중 가장 작은 것을 찾아라!
		
		
		// i의 범위를 어떻게 돌릴 것인가가 역시 고민이었다... 입력받은 num값으로 돌리면 최대 백만까지 도니까 너무 크잖어;
		
		
		// 1 <= num <= 1,000,000
		
//		int a = num - input.length() * 9;
		int sum = 0;
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < input.length(); j++) {
				sum += input.charAt(j) - 48;
			}
			sum += num;
			if(sum == num) {
				list.add(sum);
			}
		}
		
		for(int i : list) {
			System.out.print(i + " ");
		}
		br.close();
		
	}
}
