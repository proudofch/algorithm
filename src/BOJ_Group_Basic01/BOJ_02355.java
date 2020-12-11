package BOJ_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_02355 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		long answer = 0;
		
		/*  처음엔 a부터 b까지의 개수를 for문을 돌려 count 변수로 셌는데, 
			개수를 구하는 공식 (큰수-작은수+1)이 떠올라서 이를 썼더니 바로 시간 초과 통과
			1부터 10까지 합을 구할 때 (1+10) + (2+9) + ... (5+6) 이렇게 구하는 방법을 응용 */
		
		if (a < b) {
			answer = (b-a+1) * (a+b)/2;
		} else {
			answer = (a-b+1) * (a+b)/2;
		}
		
		System.out.println(answer);
		
		br.close();
		
		/* -----다른 풀이-----
		 * 등차수열의 합
			n*(a1+an)/2 (a1=1번째항, an=n번째항)  
		 * 1부터 n까지의 합
			n*(1+n)/2 -> 위 공식의 a1에 1을 대입한 것
		 * A부터 B까지의 합 -> (1부터 B까지의 합)-(1부터 A-1까지의 합) // (왜 A-1이냐면 A를 포함해야 하기 때문)
			이 원리에 위 공식을 대입하면 아래와 같다(A,B는 절대값을 쓰는 게 낫겠다... 그리고 A<B를 만족해야 함)
			{B*(B+1)/2} - {A*(A-1)/2} */
		
	}
}
