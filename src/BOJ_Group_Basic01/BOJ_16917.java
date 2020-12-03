package BOJ_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 따로 사는 경우, 반반으로 사고 나머지를 따로 채우는 경우, 큰 수로 반반을 만드는 경우를 모두 파악했으나
 * 가장 바깥의 if-else문을 못 만들었고, 나머지 수 처리를 반반으로도 할 수 있다는 생각을 못 했다. */

public class BOJ_16917 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()); // 양념치킨 가격
		int b = Integer.parseInt(st.nextToken()); // 후라이드치킨 가격
		int c = Integer.parseInt(st.nextToken()); // 반반치킨 가격
		int x = Integer.parseInt(st.nextToken()); // 양념치킨 최소 수
		int y = Integer.parseInt(st.nextToken()); // 후라이드치킨 최소 수
		
		long answer = 0;
		
		if(a+b < c*2) { // 반반치킨*2=각각 1마리. 이게 후+양보다 크다면 굳이 비싼 반반을 살 필요가 없다. 
			
			answer = a*x + b*y;
			
		} else { // 위의 경우가 아니면 >>>반반을 사는 게 낫다는 거니까<<<
			
			if(x > y) {
				answer += c*2*y; // 작은 수를 기준으로 반반치킨을 만듦
				// 그럼 나머지 수(x-y)를 반반으로 하는 게 나은가, 온전히 하나를 사는 게 나은가 -를 비교해서 최소값을 더하면 됨
				answer += Math.min((x-y)*2*c, a*(x-y));
			} else {
				answer += c*2*x;
				answer += Math.min((y-x)*2*c, b*(y-x));
			}
			
		}
						
		System.out.println(answer);
		
		br.close();
		
	}
}
