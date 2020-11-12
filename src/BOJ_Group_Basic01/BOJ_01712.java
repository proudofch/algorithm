package BOJ_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_01712 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()); // 고정비용
		int b = Integer.parseInt(st.nextToken()); // 가변비용
		int c = Integer.parseInt(st.nextToken()); // 노트북 가격
		
		/*  손익분기점이 존재하지 않는 경우?
		
			노트북을 한 대 팔 때마다 얻는 이익은 (노트북가격c-가변비용b)이다.
			이득이 생기려면 c-b가 a보다 크면 된다.
			
			이를 거꾸로 생각해보면,
			c-b>0일 경우 언젠가는 이득이 a원을 넘어설 것이고,
			c-b<=0이라면 손익분기점이 존재하지 않는다(=팔아봤자 손해보거나 0원 이득).	*/
		
		if(c-b <= 0) {
			System.out.println("-1");
		} else {
			int breakEvenPoint = a/(c-b) + 1;
			System.out.println(breakEvenPoint);
			
			/*	손익분기점 구하기
				(c-b)*x > a
				x > a/(c-b)
				그리고 1을 더하는 이유는, 나누기 연산에서 a/(c-b)의 소수점 이하 값을 버리기 때문이다.
				예) a/(c-b)=2.234 라면 2대 팔면 손해고 3대 팔면 살짝 이득이니 답은 3
				a가 (c-b)의 배수여도(=정확히 나누어 떨어져도) +1 해야 하는데, x대 판매는 이득도 손해도 없는 상태이기 때문이다.	*/
		}
		
		br.close();
	}
}