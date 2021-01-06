package BOJ_Level08_Math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L02_02292 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		
		int a = 1;
		int sum = 1;
		
		/* (원을 이루는) 벌집의 개수는 1부터 시작해 6의 배수로 늘어간다.
			n보다 큰 수가 나올 때까지 벌집의 개수를 더한 후, 어느 구간에 속하는지를 구했다. */ 
		
		while(sum < n) { // 등호를 넣으면 n=1의 값이 잘못됨
			sum += 6*a;
			a++;
		}
		
		System.out.println(a);
		
		br.close();
		
	}
}
