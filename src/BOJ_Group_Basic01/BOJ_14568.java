package BOJ_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_14568 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int candy = Integer.parseInt(br.readLine());
		int count = 0;
		
		// 택희 영훈 남규
		//  A  B  C
 		
		for(int i=2; i<=candy; i+=2) { // 택희: 짝수 개의 사탕 (0개를 가지는 사람은 없단 조건이 있으므로 2부터 시작)
			int temp = candy-i-2; // 남규는 영훈보다 2개 이상 많이 가져야하므로, 일단 2를 빼둔다.
			for(int j=1; j<=temp; j++) { // 영훈
				for(int k=temp; k>=1; k--) { // 남규
					if(j+k == temp && j<=k) { // 영훈(j)의 사탕 개수는 남규(k)보다 적거나 같아야 한다(같으면 2개 차이)
						System.out.println(i+"/"+j+"/"+k);
						count++;
					}
				}
			}
		}
		
		System.out.println(count);
		
		br.close();
		
	}
}
