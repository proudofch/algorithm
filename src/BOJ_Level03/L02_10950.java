package BOJ_Level03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L02_10950 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(buffer.readLine());
		
		String cases = "";
		int[] sum = new int[num];
		
		for(int i=0; i<num; i++) {
			cases = buffer.readLine();
			String[] numbers = cases.split(" ");
			int a = Integer.parseInt(numbers[0]);
			int b = Integer.parseInt(numbers[1]);
			sum[i] = a + b;
		}
		
		for(int j : sum) {
			System.out.println(j);			
		}
	}
}
