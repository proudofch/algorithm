package Programmers_KitForHighScore;

import java.util.Arrays;

/* 	프로그래머스
	코딩테스트 고득점 Kit
	정렬 - K번째수  */

/*	같은 문제를 두 번째로 푸는 거였는데, 첫 번째보단 수월하게 접근했다.
	for문 밖에서 answer를 만들어야 하는데(안에서 만들면 생성 반복, 누적값 적용 안될 듯)
	그 부분에서 헤맨 거 빼곤 괜찮았다.  */

public class Sort01 {
	
	public static int[] solution(int[] array, int[][] commands) {
		
		int[] answer = new int[commands.length];
		
		for(int i=0; i<commands.length; i++) {
			int a = commands[i][0];
			int b = commands[i][1];
			int c = commands[i][2];
			
			int temp[] = Arrays.copyOfRange(array, a-1, b);
			Arrays.sort(temp);
			answer[i] = temp[c-1];
		}
		
		return answer;
	}
	
}
