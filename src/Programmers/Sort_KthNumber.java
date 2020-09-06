package Programmers;

import java.util.Arrays;

/* 	프로그래머스
	코딩테스트 고득점 Kit
	정렬 - K번째수  */

/*	같은 문제를 두 번째로 푸는 거였는데, 첫 번째보단 수월하게 접근했다.
	for문 밖에서 answer를 만들어야 하는데(안에서 만들면 생성 반복, 누적값 적용 안될 듯)
	그 부분에서 헤맨 거 빼곤 괜찮았다.  */

public class Sort_KthNumber {
	
	public int[] solution(int[] array, int[][] commands) {
		
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
		
		/* 첫 번째로 낸 답
			int[] answer = new int[commands.length];
			
			int first = 0;
			int second = 0;
			int third = 0;
			
			for(int i=0; i<commands.length; i++) {
					
				first = commands[i][0];
				second = commands[i][1];
				third = commands[i][2];
				
				int[] temp = new int[second-first+1];
				temp = Arrays.copyOfRange(array, first-1, second);
				Arrays.sort(temp);
			
				answer[i] = temp[third-1];
				
			}		
			return answer;
		*/
	}
	
}
