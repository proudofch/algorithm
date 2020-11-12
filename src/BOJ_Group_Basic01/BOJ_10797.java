package BOJ_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10797 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = 0;
		int a = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<5; i++) {
			int b = Integer.parseInt(st.nextToken());
			if(a == b) {
				count += 1; //count++;
			} else {
				continue; //이 짧은 코드에서 continue가 효율적으로 동작할까?
			}
		}
		
		System.out.println(count);
		
		br.close();
		
	}
}