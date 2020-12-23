package BOJ_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_17450 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[] prices = new int[3];
		int[] weights = new int[3];
		
		for(int i=0; i<3; i++) {
			st = new StringTokenizer(br.readLine());
			int price = Integer.parseInt(st.nextToken())*10;
			if(price >= 5000) {
				price = price-500;
			}
			prices[i] = price;
			weights[i] = Integer.parseInt(st.nextToken())*10;
		}
		
		String answer = "";
		
		/* 풀이 2
		 * a/b < c/d == a*d < b*c 이므로(/이하를 없애려 양변에 b*d를 곱하면 저렇게 됨)
		 * 이를 활용하여 풀면 실수 오차를 원천 차단할 수 있다.
		 * 실수 연산을 쓰지 않고 문제를 해결할 수 있다면 그렇게 하는 것이 좋다. */
		
		if(weights[0]*prices[1] > weights[1]*prices[0]) { // 성립한다면 [0]>[1]이다.
			// [0]>[2]일 경우 -> 0이 제일 큼 -> "S"
			if(weights[0]*prices[2] > weights[2]*prices[0]) {
				answer = "S";
			} else { // [0]<[2]인 경우 -> 2가 제일 큼 -> "U"
				answer = "U";
			}
			
		} else { // [0]<[1]이다.
			// [1]>[2]인 경우 -> 1이 제일 큼 -> "N"
			if(weights[1]*prices[2] > weights[2]*prices[1]) {
				answer = "N";
			} else { // [1]<[2]인 경우 -> 2가 제일 큼 -> "U"
				answer = "U";
			}
			
		}
		
		System.out.println(answer);
		
		/* 풀이 1
		double[] gaSeongBi = new float[3];
		for(int i=0; i<gaSeongBi.length; i++) {

			st = new StringTokenizer(br.readLine());
			
			double price = Double.parseDouble(st.nextToken());
			double weight = Double.parseDouble(st.nextToken());
			double newPrice = price*10;
			
			if(price*10 >= 5000) {
				newPrice = (price*10)-500;
			}
			gaSeongBi[i] = (weight*10) / newPrice;
		
		}
		
		// 'S','N','U'를 map이나 배열에 넣어 출력하는 방법도 있다.
		if(gaSeongBi[0] > gaSeongBi[1]) {
			if(gaSeongBi[0] > gaSeongBi[2]) {
				System.out.println("S");
			} else {
				System.out.println("U");
			}
		} else { // 처음에 else 안에 if-else문 없어서 틀렸다.
			if(gaSeongBi[1] > gaSeongBi[2]) {
				System.out.println("N");
			} else {
				System.out.println("U");
			}
		}
		*/
		
		br.close();
		
	}
}
