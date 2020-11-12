package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_02525 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 현재 시간
		String[] timeNow = br.readLine().split(" ");
		int startTime = Integer.parseInt(timeNow[0]);
		int startMinutes = Integer.parseInt(timeNow[1]);
		
		// 요리에 필요한 시간
		int input = Integer.parseInt(br.readLine());
		
		// 분 단위로 입력된 요리에 필요한 시간을 시간/분으로 나누기
		int needTime = input/60;
		int needMinutes = input%60;
		
		// 끝나는 시간
		int endTime = startTime + needTime;
		int endMinutes = startMinutes + needMinutes;

		// 60분 이상일 경우 한 시간 추가
		if(endMinutes >= 60) {
			endMinutes = endMinutes-60;
			endTime++;
		}
		
		// 24시보다 큰 수 표기 방지
		if(endTime > 24) {
			endTime = endTime-24;
		}
		
		// 24시는 0으로 표시
		if(endTime == 24) endTime = 0;
		
		sb.append(endTime + " " + endMinutes);
		System.out.println(sb.toString());
		
		br.close();
	}
}
