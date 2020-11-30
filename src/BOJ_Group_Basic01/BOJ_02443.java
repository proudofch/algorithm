package BOJ_Group_Basic01;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BOJ_02443 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int star = Integer.parseInt(br.readLine());
		
		for(int i=0; i<star; i++) {
			
			for(int j=0; j<i; j++) { // 층 따라서 빈칸도 늘어남에 착안한 듯
				sb.append(" ");
			}
			for(int k=0; k<2*star-2*i-1; k++) { // k의 증감조건식은 문제에 제시된 것   
				sb.append("*");
			}
			sb.append("\n");
						
		}
		
		System.out.println(sb.toString());
		br.close();
		
	}
}
