package BOJ_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_16917 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()); // 양념치킨 가격
		int b = Integer.parseInt(st.nextToken()); // 후라이드치킨 가격
		int c = Integer.parseInt(st.nextToken()); // 반반치킨 가격
		int x = Integer.parseInt(st.nextToken()); // 양념치킨 최소 수
		int y = Integer.parseInt(st.nextToken()); // 후라이드치킨 최소 수
		
		int halfFried = c/2; 
		int halfSeasoned = c/2;
		
		long sum = (a*x) + (b*y);		
		System.out.println("sum="+sum);
		long sum2 = 0;
		
		if(x > y) { //x가 크고 y가 작으면
			
			sum2 += halfFried * y * 2;
			sum2 += halfSeasoned * (x-y);
			/*
			sum2 += c*y*2;
			sum2 += a*(x-y);
			*/
		} else {
			
			sum2 += halfSeasoned * x * 2;
			sum2 += halfFried * (y-x);
			/*
			sum2 += a*x*2;
			sum2 += b*(y-x);
			*/
		}

		long answer = (sum > sum2) ? sum2 : sum;
		System.out.println(answer);
		
		
		
		br.close();
		
	}
}
