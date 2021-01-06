package BOJ_Level08_Math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L03_01193 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int sum = 0;
		int i = 0;
		
		while(sum + i < X) { // 조건이 sum<X일 경우 마지막에 X를 넘어서는 값까지 더해지고 증감되어 틀린 답이 나온다. 
			sum += i;
			i++;
		}
		
		/* 반복문을 마치면 sum에는 원소 개수, i에는 X가 속한 줄이 담긴다.
		 * 예) 입력 8 -> sum=6, i=4.
		 * 즉, 8은 4번째 줄에 위치하며 이전까지 원소의 개수는 6개이다.

		 * 입력값-sum = 입력값의 위치 (위의 예시에선 8-6=2. 두 번째)
		 * 분자+분모=i+1이고
		 * 홀수 줄은 분자>분모 / 짝수줄은 분자<분모 */
		
//		System.out.println("sum="+sum+"/i="+i);
		
		int x = X-sum; // 입력값의 위치
		int y = i+1-x;
		
//		System.out.println("x="+x+"/"+"y="+y);
		
		/* 짝수의 경우 그 줄에서의 숫자 위치(인덱스라고 할까)가 분자에 표시
			홀수의 경우 반대로 분모에 표시 */
		if(i % 2 == 0) {
			sb.append(x).append("/").append(y);
		} else {
			sb.append(y).append("/").append(x);
		}
		
		System.out.println(sb.toString());
		
		br.close();
		
	}
}
