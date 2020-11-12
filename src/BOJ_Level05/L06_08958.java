package BOJ_Level05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L06_08958 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		String[] array = new String[n];
		int sum = 0;
		int score = 1;
		
		for(int i=0; i<n; i++) {
			
			array[i] = br.readLine();
			String[] temp = array[i].split(""); // 이럴 필요 없이, String값 그대로 chatAt() 써도 됨 
			
			for(int j=0; j<temp.length; j++) {
				
				if(temp[j].equals("O")) {
					sum += score;
					score++;
				} else {
					score = 1; // X를 만나면 score를 1로 초기화
				}
				
			}
			
			sb.append(sum+"\n");
			sum = 0;
			score = 1;
			
		}
		
		System.out.println(sb.toString());
		br.close();
		
	}
}