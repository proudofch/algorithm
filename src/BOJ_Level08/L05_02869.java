package BOJ_Level08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class L05_02869 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken()); // 낮에 올라갈 수 있는 높이
		int B = Integer.parseInt(st.nextToken()); // 밤에 미끄러지는 높이
		int V = Integer.parseInt(st.nextToken()); // 나무 높이
		// POINT: 정상에 올라간 후엔 미끄러지지 않는다.
		
		// A-B : 달팽이가 하루에 올라가는 높이
		// V-A : 이 지점까지만 가면 그 다음날(+1) 도착. 왜냐면 그 다음날에 A만 더 오르면 정상에 도달하니까
		// (V-A)/(A-B) : 오르는 데 걸리는 일수
		
		int answer = 0;
		
		if(V-A == 0) { // 곧 V==A, 올라갈 수 있는 높이==나무 높이면 1일 걸림
			answer = 1;
		} else { // 1일 초과 시
			answer = (V-A)/(A-B);
			if((V-A) % (A-B) == 0) { // 나머지가 없으면 그 다음날 도착이니까 +1 (위 참조)
				answer += 1;
			} else { // 나머지가 있으면 A+a 올라야해서 하루 더 소요되니까 +2
				answer += 2;
			}
		}
		
		System.out.println(answer);
		
		br.close();
		
	}
}
