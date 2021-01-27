package BOJ_Group_Basic02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_02864 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		/* 처음엔 입력된 숫자와 바꾼 숫자의 모든 경우를 list에 넣어 특정 인덱스만 리턴했는데 틀림. 경우의 수를 잘못 셌나봄.
		 * 이후 최소값은 6이 모두 5로 바뀌어야 하고, 최대값은 5가 모두 6으로 바뀌어야 한다는 점을 알고 수정 */
		
		String a = st.nextToken();
		String b = st.nextToken();
		String tempA = a;
		String tempB = b;
		
		if(tempA.contains("6") || tempB.contains("6")) {
			tempA = tempA.replace("6", "5");
			tempB = tempB.replace("6", "5");
		}
		
		if(a.contains("5") || b.contains("5")) {
			a = a.replace("5", "6");
			b = b.replace("5", "6");
		}
		
		int min = Integer.parseInt(tempA) + Integer.parseInt(tempB);
		int max = Integer.parseInt(a) + Integer.parseInt(b);
		System.out.println(min+" "+max);
		
		br.close();
		
	}
}
