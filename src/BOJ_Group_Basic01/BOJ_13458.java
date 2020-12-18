package BOJ_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_13458 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<Integer>();
		
		st = new StringTokenizer(br.readLine());
		
		// StringTokenizer를 두 개 쓰면 굳이 아래와 같이 ArrayList를 쓸 필요가 없다.
		for(int i=0; i<n; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		long count = 0; // 시험장이 백만 개고 각 시험장마다 백만 명의 감독관이 필요하다면 최소 인원은 1조 명. 그래서 int면 오버플로우 발생
		
		st = new StringTokenizer(br.readLine());
		int main = Integer.parseInt(st.nextToken());
		int sub = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<list.size(); i++) {
			
			int people = list.get(i);
			int temp = people - main;
			count++;
			
			// temp<=0일 때, temp%sub==0일 때와 아닐 때를 구분하면 굳이 while문을 쓰지 않아도 된다.
			if(temp > 0) {
				while(temp > 0) {
					if(temp < sub) {
						count++;
						break;
					} else {
						count += temp/sub;
						temp %= sub;
					}
				}
			}
			
		}
		
		System.out.println(count);

		br.close();
		
	}
}
